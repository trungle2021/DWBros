package com.app.dwbros.securities.JWT;

import com.app.dwbros.dtos.AuthUserDTO;
import com.app.dwbros.exceptions.DWBException;
import com.app.dwbros.securities.CustomUserDetails.CustomUserDetails;
import com.app.dwbros.utils.SD;
import io.jsonwebtoken.*;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import static com.app.dwbros.utils.SD.jwtSecret;

@Component
public class JWTProvider {



    private Key key(){
        return Keys.hmacShaKeyFor(jwtSecret.getBytes());
    }

    public String generateToken(Authentication authentication){
        CustomUserDetails userDetailService = (CustomUserDetails) authentication.getPrincipal();
        AuthUserDTO authUserDTO = userDetailService.getAuthUser();
        Map<String, Object> claims = new HashMap<>();
        claims.put("userInfo",authUserDTO);
        Date currentDate = new Date();
        Date expiredDate = new Date(currentDate.getTime() + SD.jwtExpiry);

        String token = Jwts.builder()
                .setClaims(claims)
                .setIssuedAt(new Date())
                .setExpiration(expiredDate)
                .signWith(key())
                .compact();
        return token;
    }

    public String getData(String token,String key){
        Claims claims = Jwts.parserBuilder().setSigningKey(key())
                .build().parseClaimsJws(token).getBody();
        String value = claims.get(key,String.class);
        if(value.isEmpty()){
            throw new DWBException(HttpStatus.BAD_REQUEST, "JWT claims string is empty.");
        }
        return value;
    }

    public boolean validateToken(String token){
     try{
         Jwts.parserBuilder()
                 .setSigningKey(key())
                 .build()
                 .parse(token);
         return true;
     }catch (MalformedJwtException ex) {
         throw new DWBException(HttpStatus.BAD_REQUEST, "Invalid JWT token");
     } catch (ExpiredJwtException ex) {
         throw new DWBException(HttpStatus.BAD_REQUEST, "Expired JWT token");
     } catch (UnsupportedJwtException ex) {
         throw new DWBException(HttpStatus.BAD_REQUEST, "Unsupported JWT token");
     } catch (IllegalArgumentException ex) {
         throw new DWBException(HttpStatus.BAD_REQUEST, "JWT claims string is empty.");
     }
    }

    public static String getTokenFromHeader(HttpServletRequest request){
        String bearerToken = request.getHeader("Authorization");
        if(Strings.hasText(bearerToken) && bearerToken.startsWith("Bearer")){
            String token = bearerToken.substring(7,bearerToken.length());
            return token;
        }
        return null;
    }
}

package com.app.dwbros.securities.JWT;

import com.app.dwbros.exceptions.DWBException;
import io.jsonwebtoken.*;
import io.jsonwebtoken.lang.Strings;
import io.jsonwebtoken.security.Keys;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import java.security.Key;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

import static com.app.dwbros.utils.SD.jwtExpiry;
import static com.app.dwbros.utils.SD.jwtSecret;

@Component
public class JwtService {

    private Key getSignInKey(){
        return Keys.hmacShaKeyFor(jwtSecret.getBytes());
    }

    public String generateToken(UserDetails userDetails){
        return generateToken(new HashMap<>(),userDetails);
    }

    public String generateToken(Map<String,Object> extraClaims, UserDetails userDetails){
        return Jwts
                .builder()
                .setClaims(extraClaims)
                .setSubject(userDetails.getUsername())
                .setIssuedAt(new Date(System.currentTimeMillis()))
                .setExpiration(new Date(System.currentTimeMillis() + jwtExpiry))
                .signWith(getSignInKey(), SignatureAlgorithm.HS256)
                .compact();
    }

    public String extractUsername(String token){
        return extractClaim(token,Claims::getSubject);
    }

    public <T> T extractClaim(String token, Function<Claims,T> claimsResolver){
        Claims claims = extractAllClaims(token);
       return claimsResolver.apply(claims);
    }


    public Claims extractAllClaims(String token){
        return Jwts.parserBuilder().setSigningKey(getSignInKey())
                .build().parseClaimsJws(token).getBody();

    }

    public boolean isTokenValid(String token, UserDetails userDetails){
         String username = extractUsername(token);
         return username.equals(userDetails.getUsername()) || !isTokenExpired(token);
    }



    private boolean isTokenExpired(String token) {
        return extractExpiration(token).before(new Date());
    }

    private Date extractExpiration(String token) {
        return extractClaim(token,Claims::getExpiration);
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

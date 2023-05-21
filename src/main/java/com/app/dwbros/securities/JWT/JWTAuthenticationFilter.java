package com.app.dwbros.securities.JWT;

import com.app.dwbros.repositories.AccountRepository;
import com.app.dwbros.securities.CustomUserDetailServices.CustomUserDetailService;
import io.jsonwebtoken.lang.Strings;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JWTAuthenticationFilter extends OncePerRequestFilter {
    private final AccountRepository accountRepository;
    private final CustomUserDetailService customUserDetailService;
    private JWTProvider jwtProvider;

    @Autowired
    public JWTAuthenticationFilter(JWTProvider jwtProvider, AccountRepository accountRepository, CustomUserDetailService customUserDetailService) {
        this.jwtProvider = jwtProvider;
        this.accountRepository = accountRepository;
        this.customUserDetailService = customUserDetailService;
    }

    @Override
    protected void doFilterInternal(@NonNull HttpServletRequest request,
                                    @NonNull HttpServletResponse response,
                                    @NonNull FilterChain filterChain)
                                    throws ServletException, IOException {
        String token = jwtProvider.getTokenFromHeader(request);
        if(Strings.hasText(token) && jwtProvider.validateToken(token)){
            String email = jwtProvider.getData(token, "email");
            if(!email.isEmpty() && SecurityContextHolder.getContext().getAuthentication() == null){
                UserDetails userDetails = customUserDetailService.loadUserByUsername(email);
                if(jwtProvider.validateToken(token)){
                    UsernamePasswordAuthenticationToken authToken = new
                            UsernamePasswordAuthenticationToken(userDetails,null,userDetails.getAuthorities());
                    authToken.setDetails(
                            new WebAuthenticationDetailsSource().buildDetails(request)
                    );
                    SecurityContextHolder.getContext().setAuthentication(authToken);
                }
            }
        }
        filterChain.doFilter(request,response);
    }
}

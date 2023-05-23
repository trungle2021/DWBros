package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.AuthResponse;
import com.app.dwbros.dtos.LoginDTO;
import com.app.dwbros.dtos.RegisterDTO;
import com.app.dwbros.entities.Accounts;
import com.app.dwbros.entities.Users;
import com.app.dwbros.repositories.AccountRepository;
import com.app.dwbros.securities.JWT.JwtService;
import com.app.dwbros.services.AuthService;
import lombok.Builder;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final AccountRepository accountRepository;
    private final JwtService jwtService;

    @Override
    public AuthResponse login(LoginDTO loginDTO) {
        String email = loginDTO.getEmail();
        String password = loginDTO.getPassword();

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email,password));
        Accounts accounts = accountRepository.findByEmail(email);
        if(accounts != null){
            String token = jwtService.generateToken(accounts);
            return AuthResponse.builder()
                    .accessToken(token).build();
        }
        return null;
    }

    @Override
    public RegisterDTO register(RegisterDTO registerDTO) {
        return null;
    }
}

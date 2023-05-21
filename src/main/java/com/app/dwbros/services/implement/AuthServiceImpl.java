package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.AuthResponse;
import com.app.dwbros.dtos.LoginDTO;
import com.app.dwbros.dtos.RegisterDTO;
import com.app.dwbros.services.AuthService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;

public class AuthServiceImpl implements AuthService {

    @Override
    public AuthResponse login(LoginDTO loginDTO) {
        String email = loginDTO.getEmail();
        String password = loginDTO.getPassword();
        Authentication authentication = new UsernamePasswordAuthenticationToken(email,password);
        authentication.
        return null;
    }

    @Override
    public RegisterDTO register(RegisterDTO registerDTO) {
        return null;
    }
}

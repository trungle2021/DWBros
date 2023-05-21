package com.app.dwbros.services;

import com.app.dwbros.dtos.AuthResponse;
import com.app.dwbros.dtos.LoginDTO;
import com.app.dwbros.dtos.RegisterDTO;

public interface AuthService {
    AuthResponse login(LoginDTO loginDTO);
    RegisterDTO register(RegisterDTO registerDTO);
}

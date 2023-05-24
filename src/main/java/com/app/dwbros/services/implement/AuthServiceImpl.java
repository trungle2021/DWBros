package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.AccountDTO;
import com.app.dwbros.dtos.AuthResponse;
import com.app.dwbros.dtos.LoginDTO;
import com.app.dwbros.dtos.RegisterDTO;
import com.app.dwbros.entities.Accounts;
import com.app.dwbros.repositories.AccountRepository;
import com.app.dwbros.securities.JWT.JwtService;
import com.app.dwbros.services.AccountService;
import com.app.dwbros.services.AuthService;
import com.app.dwbros.services.RoleService;
import com.app.dwbros.services.UserService;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService {

    private final AuthenticationManager authenticationManager;
    private final AccountService accountService;
    private final UserService userService;
    private final RoleService roleService;
    private final JwtService jwtService;

    @Override
    public AuthResponse login(LoginDTO loginDTO) {
        String email = loginDTO.getEmail();
        String password = loginDTO.getPassword();

        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(email,password));
        AccountDTO accounts = accountService.getOneByEmail(email);
        if(accounts != null){
            String token = jwtService.generateToken((UserDetails) accounts);
            return AuthResponse.builder()
                    .accessToken(token).build();
        }
        return null;
    }

    @Override
    @Transactional
    public RegisterDTO register(RegisterDTO registerDTO) {
        String email = registerDTO.getEmail();
        String password = registerDTO.getPassword();
        String roleId = roleService.getOneByRoleName(registerDTO.getRoleName()).getRoleId();

        AccountDTO accountDTO = AccountDTO.builder()
                .email(email)
                .password(password)
                .roleId(roleId).build();
        accountDTO = accountService.create(accountDTO);
        userService.create(accountDTO.getAccountId());

        return null;
    }
}

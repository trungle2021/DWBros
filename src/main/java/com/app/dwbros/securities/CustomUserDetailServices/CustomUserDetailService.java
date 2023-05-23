package com.app.dwbros.securities.CustomUserDetailServices;

import com.app.dwbros.dtos.AccountDTO;
import com.app.dwbros.dtos.AuthUserDTO;
import com.app.dwbros.entities.Accounts;
import com.app.dwbros.securities.CustomUserDetails.CustomUserDetails;
import com.app.dwbros.services.AccountService;
import com.app.dwbros.services.RoleService;
import com.app.dwbros.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class CustomUserDetailService implements UserDetailsService {
    private AccountService accountService;
    private UserService userService;
    private RoleService roleService;

    @Autowired
    public CustomUserDetailService(AccountService accountService, RoleService roleService) {
        this.accountService = accountService;
        this.roleService = roleService;
    }

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
        AccountDTO account = accountService.getOneByEmail(email);
        if(account == null){
            throw new UsernameNotFoundException("Email not existed");
        }else{
            String accountId = account.getAccountId();
            AuthUserDTO authUserDTO = new AuthUserDTO();
            String roleName = roleService.getOneByAccountId(accountId).getRoleName();
            String userId = userService.getOneByAccountId(accountId).getUserId();
            List<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority(roleName));

            authUserDTO.setEmail(account.getEmail());
            authUserDTO.setPassword(account.getPassword());
            authUserDTO.setAuthorities(authorities);
            authUserDTO.setUserID(userId);
            return new CustomUserDetails(authUserDTO);
        }
    }
}

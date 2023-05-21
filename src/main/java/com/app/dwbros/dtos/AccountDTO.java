package com.app.dwbros.dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AccountDTO {
    private String accountId;
    private String email;
    private String password;
    private String roleId;
    private String oauth;
    private boolean is_deleted;
    private RoleDTO rolesByRoleId;
    private Collection<UserDTO> usersByAccountId;
}

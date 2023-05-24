package com.app.dwbros.dtos;

import com.app.dwbros.entities.Roles;
import com.app.dwbros.entities.Users;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Data
public class AccountDTO {
    private String accountId;
    private String email;
    private Boolean isDeleted;
    private String oauth;
    private String password;
    private String roleId;
    private RoleDTO rolesByRoleId;
    private Collection<UserDTO> usersByAccountId;
}

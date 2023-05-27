package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;
@Data
@Entity
public class Roles {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "role_id", nullable = false, length = 36)
    private String roleId;
    @Basic
    @Column(name = "role_name", nullable = true, length = 50)
    private String roleName;
    @OneToMany(mappedBy = "rolesByRoleId")
    private Collection<Accounts> accountsByRoleId;
}

package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "roles",uniqueConstraints = @UniqueConstraint(columnNames = "role_name"))
public class Roles {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "role_id", nullable = false, length = 36)
    private String roleId;
    @Basic
    @Column(name = "role_name", nullable = true, length = 50)
    private String roleName;
    @OneToMany(mappedBy = "rolesByRoleId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<Accounts> accountsByRoleId = new HashSet<>();

}

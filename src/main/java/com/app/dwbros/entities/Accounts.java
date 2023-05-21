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
@Table(name = "accounts", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class Accounts {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "account_id", nullable = false, length = 36)
    private String accountId;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "password", nullable = true, length = 100)
    private String password;
    @Basic
    @Column(name = "role_id", nullable = true, length = 36)
    private String roleId;
    @Basic
    @Column(name = "oauth", nullable = true, length = 100)
    private String oauth;

    @Basic
    @Column(name = "is_deleted", columnDefinition = "TINYINT(1)",length = 1)
    private boolean is_deleted;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id",insertable=false, updatable=false)
    private Roles rolesByRoleId;
    @OneToMany(mappedBy = "accountsByAccountId")
    private Collection<Users> usersByAccountId = new HashSet<>();
}

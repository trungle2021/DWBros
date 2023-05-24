package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Accounts implements UserDetails {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "account_id", nullable = false, length = 36)
    private String accountId;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "is_deleted", nullable = true)
    private Boolean isDeleted;
    @Basic
    @Column(name = "oauth", nullable = true, length = 100)
    private String oauth;
    @Basic
    @Column(name = "password", nullable = true, length = 100)
    private String password;
    @Basic
    @Column(name = "role_id", nullable = true, length = 36)
    private String roleId;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id",insertable = false,updatable = false)
    private Roles rolesByRoleId;
    @OneToMany(mappedBy = "accountsByAccountId")
    private Collection<Users> usersByAccountId;


    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority(rolesByRoleId.getRoleName()));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}

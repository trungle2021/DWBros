package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @Basic
    @Column(name = "account_id", nullable = true, length = 36)
    private String accountId;
    @Basic
    @Column(name = "age")
    private Integer age;
    @Basic
    @Column(name = "is_deleted", nullable = true)
    private Byte isDeleted;
    @Basic
    @Column(name = "is_verified", nullable = true)
    private Byte isVerified;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<Bills> billsByUserId;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<FavoriteCuisines> favoriteCuisinesByUserId;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<RemainMaterials> remainMaterialsByUserId;
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id",insertable = false,updatable = false)
    private Accounts accountsByAccountId;


}

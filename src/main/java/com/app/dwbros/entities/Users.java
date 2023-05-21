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
public class Users {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;
    @Basic
    @Column(name = "account_id", nullable = true, length = 36)
    private String accountId;

    @Basic
    @Column(name = "is_deleted", columnDefinition = "TINYINT(1)",length = 1)
    private boolean is_deleted;
    @Basic
    @Column(name = "is_verified", columnDefinition = "TINYINT(1)", length = 1)
    private boolean is_verified;
    @OneToMany(mappedBy = "usersByUserId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<FavoriteCuisines> favoriteCuisinesByUserId = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id",insertable=false, updatable=false)
    private Accounts accountsByAccountId;

}

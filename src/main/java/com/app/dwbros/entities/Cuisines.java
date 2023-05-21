package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Cuisines {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "cusine_id", nullable = false, length = 36)
    private String cusineId;
    @Basic
    @Column(name = "cuisine_name", nullable = true, length = 50)
    private String cuisineName;
    @OneToMany(mappedBy = "cuisinesByCuisineId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<FavoriteCuisines> favoriteCuisinesByCusineId = new HashSet<>();
    @OneToMany(mappedBy = "cuisinesByCuisineId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<Food> foodsByCusineId = new HashSet<>();

}

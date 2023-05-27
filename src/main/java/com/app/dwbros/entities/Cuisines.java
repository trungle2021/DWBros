package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

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
    @OneToMany(mappedBy = "cuisinesByCuisineId")
    private Collection<FavoriteCuisines> favoriteCuisinesByCusineId;
    @OneToMany(mappedBy = "cuisinesByCuisineId")
    private Collection<Food> foodsByCusineId;
}

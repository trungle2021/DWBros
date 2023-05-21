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
public class Food {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "food_id", nullable = false, length = 36)
    private String foodId;
    @Basic
    @Column(name = "food_name", nullable = true, length = 50)
    private String foodName;
    @Basic
    @Column(name = "cuisine_id", nullable = true, length = 36)
    private String cuisineId;
    @ManyToOne
    @JoinColumn(name = "cuisine_id", referencedColumnName = "cusine_id",insertable = false,updatable = false)
    private Cuisines cuisinesByCuisineId;
    @OneToMany(mappedBy = "foodByFoodId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<FoodTypes> foodTypesByFoodId = new HashSet<>();
    @OneToMany(mappedBy = "foodByFoodId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<Recipes> recipesByFoodId = new HashSet<>();


}

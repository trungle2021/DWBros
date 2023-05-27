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
public class Food {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "food_id", nullable = false, length = 36)
    private String foodId;
    @Basic
    @Column(name = "cuisine_id", nullable = true, length = 36)
    private String cuisineId;
    @Basic
    @Column(name = "food_name", nullable = true, length = 50)
    private String foodName;
    @ManyToOne
    @JoinColumn(name = "cuisine_id", referencedColumnName = "cusine_id",insertable = false,updatable = false)
    private Cuisines cuisinesByCuisineId;

    @OneToMany(mappedBy = "foodByFoodId")
    private Collection<Recipes> recipesByFoodId;


}

package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Collection;

@Entity
@Data
public class Recipes {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;
    @Basic
    @Column(name = "food_id", nullable = true, length = 36)
    private String foodId;
    @OneToMany(mappedBy = "recipesByRecipeId")
    private Collection<RecipeDetails> recipeDetailsById;
    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "food_id",insertable = false,updatable = false)
    private Food foodByFoodId;

}

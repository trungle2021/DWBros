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
public class Recipes {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "id", nullable = false, length = 36)
    private String id;
    @Basic
    @Column(name = "food_id", nullable = true, length = 36)
    private String foodId;
    @OneToMany(mappedBy = "recipesByRecipeId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<RecipeDetails> recipeDetailsById = new HashSet<>();
    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "food_id",insertable=false, updatable=false)
    private Food foodByFoodId;


}

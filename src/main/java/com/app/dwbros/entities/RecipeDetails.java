package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "recipe_details", schema = "dwbros")
@IdClass(RecipeDetailsPK.class)
public class RecipeDetails {
    @Id
    @Column(name = "recipe_id", nullable = false, length = 36)
    private String recipeId;
    @Id
    @Column(name = "material_id", nullable = false, length = 36)
    private String materialId;
    @ManyToOne
    @JoinColumn(name = "recipe_id", referencedColumnName = "id", nullable = false,insertable = false,updatable = false)
    private Recipes recipesByRecipeId;
    @ManyToOne
    @JoinColumn(name = "material_id", referencedColumnName = "material_id", nullable = false,insertable = false,updatable = false)
    private Materials materialsByMaterialId;


}

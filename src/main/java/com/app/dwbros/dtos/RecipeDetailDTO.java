package com.app.dwbros.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDetailDTO {
    private String recipeId;
    private String materialId;
    private RecipeDTO recipesByRecipeId;
    private MaterialDTO materialsByMaterialId;


}

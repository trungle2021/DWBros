package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;

@Data
public class RecipeDetailsPK implements Serializable {
    @Column(name = "recipe_id", nullable = false, length = 36)
    @Id
    private String recipeId;
    @Column(name = "material_id", nullable = false, length = 36)
    @Id
    private String materialId;

}

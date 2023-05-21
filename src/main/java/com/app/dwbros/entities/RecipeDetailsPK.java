package com.app.dwbros.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RecipeDetailsPK implements Serializable {
    @Column(name = "recipe_id", nullable = false, length = 36)
    @Id
    private String recipeId;
    @Column(name = "material_id", nullable = false, length = 36)
    @Id
    private String materialId;
}

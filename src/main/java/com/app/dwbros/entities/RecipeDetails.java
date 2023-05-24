package com.app.dwbros.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "recipe_details", schema = "dwbros", catalog = "")
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

    public String getRecipeId() {
        return recipeId;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RecipeDetails that = (RecipeDetails) o;

        if (recipeId != null ? !recipeId.equals(that.recipeId) : that.recipeId != null) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = recipeId != null ? recipeId.hashCode() : 0;
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        return result;
    }

    public Recipes getRecipesByRecipeId() {
        return recipesByRecipeId;
    }

    public void setRecipesByRecipeId(Recipes recipesByRecipeId) {
        this.recipesByRecipeId = recipesByRecipeId;
    }

    public Materials getMaterialsByMaterialId() {
        return materialsByMaterialId;
    }

    public void setMaterialsByMaterialId(Materials materialsByMaterialId) {
        this.materialsByMaterialId = materialsByMaterialId;
    }
}

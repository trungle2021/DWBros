package com.app.dwbros.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Recipes {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Recipes recipes = (Recipes) o;

        if (id != null ? !id.equals(recipes.id) : recipes.id != null) return false;
        if (foodId != null ? !foodId.equals(recipes.foodId) : recipes.foodId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (foodId != null ? foodId.hashCode() : 0);
        return result;
    }

    public Collection<RecipeDetails> getRecipeDetailsById() {
        return recipeDetailsById;
    }

    public void setRecipeDetailsById(Collection<RecipeDetails> recipeDetailsById) {
        this.recipeDetailsById = recipeDetailsById;
    }

    public Food getFoodByFoodId() {
        return foodByFoodId;
    }

    public void setFoodByFoodId(Food foodByFoodId) {
        this.foodByFoodId = foodByFoodId;
    }
}

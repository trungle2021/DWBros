package com.app.dwbros.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
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
    private Collection<FoodTypes> foodTypesByFoodId;
    @OneToMany(mappedBy = "foodByFoodId")
    private Collection<Recipes> recipesByFoodId;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Food food = (Food) o;

        if (foodId != null ? !foodId.equals(food.foodId) : food.foodId != null) return false;
        if (cuisineId != null ? !cuisineId.equals(food.cuisineId) : food.cuisineId != null) return false;
        if (foodName != null ? !foodName.equals(food.foodName) : food.foodName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = foodId != null ? foodId.hashCode() : 0;
        result = 31 * result + (cuisineId != null ? cuisineId.hashCode() : 0);
        result = 31 * result + (foodName != null ? foodName.hashCode() : 0);
        return result;
    }

    public Cuisines getCuisinesByCuisineId() {
        return cuisinesByCuisineId;
    }

    public void setCuisinesByCuisineId(Cuisines cuisinesByCuisineId) {
        this.cuisinesByCuisineId = cuisinesByCuisineId;
    }

    public Collection<FoodTypes> getFoodTypesByFoodId() {
        return foodTypesByFoodId;
    }

    public void setFoodTypesByFoodId(Collection<FoodTypes> foodTypesByFoodId) {
        this.foodTypesByFoodId = foodTypesByFoodId;
    }

    public Collection<Recipes> getRecipesByFoodId() {
        return recipesByFoodId;
    }

    public void setRecipesByFoodId(Collection<Recipes> recipesByFoodId) {
        this.recipesByFoodId = recipesByFoodId;
    }
}

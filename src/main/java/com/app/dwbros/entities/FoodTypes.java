package com.app.dwbros.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "food_types", schema = "dwbros", catalog = "")
@IdClass(FoodTypesPK.class)
public class FoodTypes {
    @Id
    @Column(name = "meal_time_id", nullable = false, length = 36)
    private String mealTimeId;
    @Id
    @Column(name = "food_id", nullable = false, length = 36)
    private String foodId;
    @Id
    @Column(name = "category_id", nullable = false, length = 36)
    private String categoryId;
    @ManyToOne
    @JoinColumn(name = "meal_time_id", referencedColumnName = "meal_time_id", nullable = false,insertable = false,updatable = false)
    private MealTimes mealTimesByMealTimeId;
    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "food_id", nullable = false,insertable = false,updatable = false)
    private Food foodByFoodId;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false,insertable = false,updatable = false)
    private FoodCategories foodCategoriesByCategoryId;

    public String getMealTimeId() {
        return mealTimeId;
    }

    public void setMealTimeId(String mealTimeId) {
        this.mealTimeId = mealTimeId;
    }

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodTypes foodTypes = (FoodTypes) o;

        if (mealTimeId != null ? !mealTimeId.equals(foodTypes.mealTimeId) : foodTypes.mealTimeId != null) return false;
        if (foodId != null ? !foodId.equals(foodTypes.foodId) : foodTypes.foodId != null) return false;
        if (categoryId != null ? !categoryId.equals(foodTypes.categoryId) : foodTypes.categoryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mealTimeId != null ? mealTimeId.hashCode() : 0;
        result = 31 * result + (foodId != null ? foodId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        return result;
    }

    public MealTimes getMealTimesByMealTimeId() {
        return mealTimesByMealTimeId;
    }

    public void setMealTimesByMealTimeId(MealTimes mealTimesByMealTimeId) {
        this.mealTimesByMealTimeId = mealTimesByMealTimeId;
    }

    public Food getFoodByFoodId() {
        return foodByFoodId;
    }

    public void setFoodByFoodId(Food foodByFoodId) {
        this.foodByFoodId = foodByFoodId;
    }

    public FoodCategories getFoodCategoriesByCategoryId() {
        return foodCategoriesByCategoryId;
    }

    public void setFoodCategoriesByCategoryId(FoodCategories foodCategoriesByCategoryId) {
        this.foodCategoriesByCategoryId = foodCategoriesByCategoryId;
    }
}

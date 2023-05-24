package com.app.dwbros.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class FoodTypesPK implements Serializable {
    @Column(name = "meal_time_id", nullable = false, length = 36)
    @Id
    private String mealTimeId;
    @Column(name = "food_id", nullable = false, length = 36)
    @Id
    private String foodId;
    @Column(name = "category_id", nullable = false, length = 36)
    @Id
    private String categoryId;

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

        FoodTypesPK that = (FoodTypesPK) o;

        if (mealTimeId != null ? !mealTimeId.equals(that.mealTimeId) : that.mealTimeId != null) return false;
        if (foodId != null ? !foodId.equals(that.foodId) : that.foodId != null) return false;
        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = mealTimeId != null ? mealTimeId.hashCode() : 0;
        result = 31 * result + (foodId != null ? foodId.hashCode() : 0);
        result = 31 * result + (categoryId != null ? categoryId.hashCode() : 0);
        return result;
    }
}

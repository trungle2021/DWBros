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
public class FoodTypeDTO {
    private String foodId;
    private String categoryId;
    private String mealTimeId;
    private FoodDTO foodByFoodId;
    private FoodCategoryDTO foodCategoriesByCategoryId;
    private MealTimeDTO mealTimesByMealTimeId;
}

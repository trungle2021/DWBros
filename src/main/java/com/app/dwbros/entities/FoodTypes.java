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
@IdClass(FoodTypesPK.class)
public class FoodTypes {
    @Id
    @Column(name = "food_id", nullable = false, length = 36)
    private String foodId;
    @Id
    @Column(name = "category_id", nullable = false, length = 36)
    private String categoryId;
    @Id
    @Column(name = "meal_time_id", nullable = false, length = 36)
    private String mealTimeId;
    @ManyToOne
    @JoinColumn(name = "food_id", referencedColumnName = "food_id", nullable = false,insertable=false, updatable=false)
    private Food foodByFoodId;
    @ManyToOne
    @JoinColumn(name = "category_id", referencedColumnName = "category_id", nullable = false,insertable=false, updatable=false)
    private FoodCategories foodCategoriesByCategoryId;
    @ManyToOne
    @JoinColumn(name = "meal_time_id", referencedColumnName = "meal_time_id", nullable = false,insertable=false, updatable=false)
    private MealTimes mealTimesByMealTimeId;


}

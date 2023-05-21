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
public class FoodTypesPK implements Serializable {
    @Column(name = "food_id", nullable = false, length = 36)
    @Id
    private String foodId;
    @Column(name = "category_id", nullable = false, length = 36)
    @Id
    private String categoryId;
    @Column(name = "meal_time_id", nullable = false, length = 36)
    @Id
    private String mealTimeId;


}

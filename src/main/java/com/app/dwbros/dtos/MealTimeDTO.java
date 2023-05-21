package com.app.dwbros.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MealTimeDTO {
    private String mealTimeId;
    private String times;
    private Collection<FoodTypeDTO> foodTypesByMealTimeId;


}

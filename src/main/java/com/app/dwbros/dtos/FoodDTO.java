package com.app.dwbros.dtos;
import com.app.dwbros.entities.Recipes;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FoodDTO {
    private String foodId;
    private String foodName;
    private String cuisineId;
    private CuisineDTO cuisinesByCuisineId;
    private Collection<FoodTypes> foodTypesByFoodId;
    private Collection<Recipes> recipesByFoodId;


}

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
public class CuisineDTO {
    private String cusineId;
    private String cuisineName;
    private Collection<FavoriteCuisines> favoriteCuisinesByCusineId;
    private Collection<Food> foodsByCusineId;
}

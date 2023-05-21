package com.app.dwbros.dtos;

import com.app.dwbros.entities.Users;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteCuisineDTO {
    private String userId;
    private String cuisineId;
    private Users usersByUserId;
    private CuisineDTO cuisinesByCuisineId;
}

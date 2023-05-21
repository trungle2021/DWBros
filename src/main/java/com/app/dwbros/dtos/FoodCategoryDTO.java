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
public class FoodCategoryDTO {
    private String categoryId;
    private String categoryName;
    private Collection<FoodTypeDTO> foodTypesByCategoryId;


}

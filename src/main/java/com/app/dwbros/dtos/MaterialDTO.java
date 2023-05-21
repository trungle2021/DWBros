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
public class MaterialDTO {
    private String materialId;
    private String materialName;
    private String images;
    private Collection<RecipeDetailDTO> recipeDetailsByMaterialId;
    private Collection<RemainMaterialDTO> remainMaterialsByMaterialId;
}

package com.app.dwbros.services;

import com.app.dwbros.dtos.RecipeDetailDTO;

import java.util.List;

public interface RecipeDetailService {
    List<RecipeDetailDTO> getAll();
    RecipeDetailDTO getOneById(String id);
    RecipeDetailDTO update(String id);
    void delete(String id);
}

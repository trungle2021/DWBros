package com.app.dwbros.services;

import com.app.dwbros.dtos.RecipeDTO;

import java.util.List;

public interface RecipeService {
    List<RecipeDTO> getAll();
    RecipeDTO getOneById(String id);
    RecipeDTO update(String id);
    void delete(String id);
}

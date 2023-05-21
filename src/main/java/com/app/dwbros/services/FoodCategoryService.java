package com.app.dwbros.services;

import com.app.dwbros.dtos.FoodCategoryDTO;

import java.util.List;

public interface FoodCategoryService {
    List<FoodCategoryDTO> getAll();
    FoodCategoryDTO getOneById(String id);
    FoodCategoryDTO update(String id);
    void delete(String id);
}

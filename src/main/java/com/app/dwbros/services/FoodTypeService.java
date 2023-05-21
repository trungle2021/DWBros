package com.app.dwbros.services;

import com.app.dwbros.dtos.FoodTypeDTO;

import java.util.List;

public interface FoodTypeService {
    List<FoodTypeDTO> getAll();
    FoodTypeDTO getOneById(String id);
    FoodTypeDTO update(String id);
    void delete(String id);
}

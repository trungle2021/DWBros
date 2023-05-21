package com.app.dwbros.services;

import com.app.dwbros.dtos.FoodDTO;

import java.util.List;

public interface FoodService {
    List<FoodDTO> getAll();
    FoodDTO getOneById(String id);
    FoodDTO update(String id);
    void delete(String id);
}

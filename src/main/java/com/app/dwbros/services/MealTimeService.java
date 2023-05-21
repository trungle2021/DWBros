package com.app.dwbros.services;

import com.app.dwbros.dtos.MealTimeDTO;

import java.util.List;

public interface MealTimeService {
    List<MealTimeDTO> getAll();
    MealTimeDTO getOneById(String id);
    MealTimeDTO update(String id);
    void delete(String id);
}

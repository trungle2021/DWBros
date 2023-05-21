package com.app.dwbros.services;

import com.app.dwbros.dtos.FavoriteCuisineDTO;

import java.util.List;

public interface FavoriteCuisineService {
    List<FavoriteCuisineDTO> getAll();
    FavoriteCuisineDTO getOneById(String id);
    FavoriteCuisineDTO update(String id);
    void delete(String id);
}

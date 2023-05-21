package com.app.dwbros.services;

import com.app.dwbros.dtos.CuisineDTO;

import java.util.List;

public interface CuisineService {
    List<CuisineDTO> getAll();
    CuisineDTO getOneById(String id);
    CuisineDTO update(String id);
    void delete(String id);
}

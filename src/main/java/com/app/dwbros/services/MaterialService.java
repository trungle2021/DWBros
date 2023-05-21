package com.app.dwbros.services;

import com.app.dwbros.dtos.MaterialDTO;

import java.util.List;

public interface MaterialService {
    List<MaterialDTO> getAll();
    MaterialDTO getOneById(String id);
    MaterialDTO update(String id);
    void delete(String id);
}

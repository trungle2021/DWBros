package com.app.dwbros.services;

import com.app.dwbros.dtos.RemainMaterialDTO;

import java.util.List;

public interface RemainMaterialService {
    List<RemainMaterialDTO> getAll();
    RemainMaterialDTO getOneById(String id);
    RemainMaterialDTO update(String id);
    void delete(String id);
}

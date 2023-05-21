package com.app.dwbros.services;

import com.app.dwbros.dtos.BillImageDTO;

import java.util.List;

public interface BillImageService {
    List<BillImageDTO> getAll();
    BillImageDTO getOneById(String id);
    BillImageDTO update(String id);
    void delete(String id);
}

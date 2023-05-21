package com.app.dwbros.services;

import com.app.dwbros.dtos.BillDTO;

import java.util.List;

public interface BillService {
    List<BillDTO> getAll();
    BillDTO getOneById(String id);
    BillDTO update(String id);
    void delete(String id);
}

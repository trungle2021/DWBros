package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.BillDTO;
import com.app.dwbros.services.BillService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class BillServiceImpl implements BillService {
    @Override
    public List<BillDTO> getAll() {
        return null;
    }

    @Override
    public BillDTO getOneById(String id) {
        return null;
    }

    @Override
    public BillDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

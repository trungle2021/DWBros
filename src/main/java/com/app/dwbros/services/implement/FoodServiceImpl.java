package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.FoodDTO;
import com.app.dwbros.services.FoodService;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FoodServiceImpl implements FoodService {
    @Override
    public List<FoodDTO> getAll() {
        return null;
    }

    @Override
    public FoodDTO getOneById(String id) {
        return null;
    }

    @Override
    public FoodDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

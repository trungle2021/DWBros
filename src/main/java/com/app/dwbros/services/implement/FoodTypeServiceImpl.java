package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.FoodTypeDTO;
import com.app.dwbros.services.FoodTypeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FoodTypeServiceImpl implements FoodTypeService {
    @Override
    public List<FoodTypeDTO> getAll() {
        return null;
    }

    @Override
    public FoodTypeDTO getOneById(String id) {
        return null;
    }

    @Override
    public FoodTypeDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

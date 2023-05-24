package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.FoodCategoryDTO;
import com.app.dwbros.services.FoodCategoryService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FoodCategoryServiceImpl implements FoodCategoryService {
    @Override
    public List<FoodCategoryDTO> getAll() {
        return null;
    }

    @Override
    public FoodCategoryDTO getOneById(String id) {
        return null;
    }

    @Override
    public FoodCategoryDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.RecipeDTO;
import com.app.dwbros.services.RecipeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeServiceImpl implements RecipeService {
    @Override
    public List<RecipeDTO> getAll() {
        return null;
    }

    @Override
    public RecipeDTO getOneById(String id) {
        return null;
    }

    @Override
    public RecipeDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

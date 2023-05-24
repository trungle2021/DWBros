package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.RecipeDetailDTO;
import com.app.dwbros.services.RecipeDetailService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RecipeDetailServiceImpl implements RecipeDetailService {
    @Override
    public List<RecipeDetailDTO> getAll() {
        return null;
    }

    @Override
    public RecipeDetailDTO getOneById(String id) {
        return null;
    }

    @Override
    public RecipeDetailDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

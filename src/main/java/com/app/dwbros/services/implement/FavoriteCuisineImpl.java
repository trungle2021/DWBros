package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.FavoriteCuisineDTO;
import com.app.dwbros.services.FavoriteCuisineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class FavoriteCuisineImpl implements FavoriteCuisineService {
    @Override
    public List<FavoriteCuisineDTO> getAll() {
        return null;
    }

    @Override
    public FavoriteCuisineDTO getOneById(String id) {
        return null;
    }

    @Override
    public FavoriteCuisineDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

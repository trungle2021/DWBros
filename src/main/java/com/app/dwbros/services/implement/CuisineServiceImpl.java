package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.CuisineDTO;
import com.app.dwbros.services.CuisineService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class CuisineServiceImpl implements CuisineService {
    @Override
    public List<CuisineDTO> getAll() {
        return null;
    }

    @Override
    public CuisineDTO getOneById(String id) {
        return null;
    }

    @Override
    public CuisineDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

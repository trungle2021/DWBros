package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.MaterialDTO;
import com.app.dwbros.services.MaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class MaterialServiceImpl implements MaterialService {
    @Override
    public List<MaterialDTO> getAll() {
        return null;
    }

    @Override
    public MaterialDTO getOneById(String id) {
        return null;
    }

    @Override
    public MaterialDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

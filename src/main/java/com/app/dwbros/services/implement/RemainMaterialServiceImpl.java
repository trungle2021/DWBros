package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.RemainMaterialDTO;
import com.app.dwbros.services.RemainMaterialService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RemainMaterialServiceImpl implements RemainMaterialService {
    @Override
    public List<RemainMaterialDTO> getAll() {
        return null;
    }

    @Override
    public RemainMaterialDTO getOneById(String id) {
        return null;
    }

    @Override
    public RemainMaterialDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

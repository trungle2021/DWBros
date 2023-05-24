package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.MealTimeDTO;
import com.app.dwbros.services.MealTimeService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class MealTimeServiceImpl implements MealTimeService {
    @Override
    public List<MealTimeDTO> getAll() {
        return null;
    }

    @Override
    public MealTimeDTO getOneById(String id) {
        return null;
    }

    @Override
    public MealTimeDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

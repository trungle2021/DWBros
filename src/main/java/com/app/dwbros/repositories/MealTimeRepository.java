package com.app.dwbros.repositories;

import com.app.dwbros.entities.MealTimes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MealTimeRepository extends JpaRepository<MealTimes,String> {
}

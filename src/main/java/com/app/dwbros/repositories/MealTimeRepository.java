package com.app.dwbros.repositories;

import com.app.dwbros.entities.MealTimes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MealTimeRepository extends JpaRepository<MealTimes,String> {
}

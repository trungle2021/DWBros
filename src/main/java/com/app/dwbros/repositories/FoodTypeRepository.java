package com.app.dwbros.repositories;

import com.app.dwbros.entities.FoodTypes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodTypeRepository extends JpaRepository<FoodTypes,String> {
}

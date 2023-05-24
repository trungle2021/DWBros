package com.app.dwbros.repositories;

import com.app.dwbros.entities.Food;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodRepository extends JpaRepository<Food,String> {
}

package com.app.dwbros.repositories;
import com.app.dwbros.entities.FoodCategories;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodCategoryRepository extends JpaRepository<FoodCategories,String> {
}

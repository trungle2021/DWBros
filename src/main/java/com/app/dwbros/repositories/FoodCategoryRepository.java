package com.app.dwbros.repositories;
import com.app.dwbros.entities.MaterialsCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FoodCategoryRepository extends JpaRepository<MaterialsCategories,String> {
}

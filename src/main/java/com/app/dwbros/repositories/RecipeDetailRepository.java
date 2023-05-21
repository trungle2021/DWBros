package com.app.dwbros.repositories;

import com.app.dwbros.entities.RecipeDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeDetailRepository extends JpaRepository<RecipeDetails,String> {
}

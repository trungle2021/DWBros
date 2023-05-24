package com.app.dwbros.repositories;

import com.app.dwbros.entities.RecipeDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeDetailRepository extends JpaRepository<RecipeDetails,String> {
}

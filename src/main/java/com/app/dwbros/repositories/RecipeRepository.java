package com.app.dwbros.repositories;

import com.app.dwbros.entities.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RecipeRepository extends JpaRepository<Recipes,String> {
}

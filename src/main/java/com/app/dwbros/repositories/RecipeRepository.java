package com.app.dwbros.repositories;

import com.app.dwbros.entities.Recipes;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecipeRepository extends JpaRepository<Recipes,String> {
}

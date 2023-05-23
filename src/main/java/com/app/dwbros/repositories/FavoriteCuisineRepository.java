package com.app.dwbros.repositories;

import com.app.dwbros.entities.FavoriteCuisines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FavoriteCuisineRepository extends JpaRepository<FavoriteCuisines,String> {
}

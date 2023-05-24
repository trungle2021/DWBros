package com.app.dwbros.repositories;

import com.app.dwbros.entities.FavoriteCuisines;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoriteCuisineRepository extends JpaRepository<FavoriteCuisines,String> {
}

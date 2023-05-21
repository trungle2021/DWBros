package com.app.dwbros.repositories;

import com.app.dwbros.entities.Accounts;
import com.app.dwbros.entities.Cuisines;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuisineRepository extends JpaRepository<Cuisines,String> {
}

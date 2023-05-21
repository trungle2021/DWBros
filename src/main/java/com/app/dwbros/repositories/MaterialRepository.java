package com.app.dwbros.repositories;

import com.app.dwbros.entities.Materials;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MaterialRepository extends JpaRepository<Materials,String> {
}

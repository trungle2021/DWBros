package com.app.dwbros.repositories;

import com.app.dwbros.entities.Materials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MaterialRepository extends JpaRepository<Materials,String> {
}

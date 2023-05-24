package com.app.dwbros.repositories;

import com.app.dwbros.entities.RemainMaterials;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RemainMaterialRepository extends JpaRepository<RemainMaterials,String> {
}

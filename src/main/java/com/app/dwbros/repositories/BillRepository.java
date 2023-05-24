package com.app.dwbros.repositories;

import com.app.dwbros.entities.Accounts;
import com.app.dwbros.entities.Bills;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillRepository extends JpaRepository<Bills,String> {
}

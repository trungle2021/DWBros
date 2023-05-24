package com.app.dwbros.repositories;

import com.app.dwbros.dtos.AccountDTO;
import com.app.dwbros.entities.Accounts;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<Accounts,String> {
    Accounts findByEmail(String email);
}

package com.app.dwbros.repositories;

import com.app.dwbros.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users,String> {
    Users findByAccountId(String accountId);
}

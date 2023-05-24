package com.app.dwbros.repositories;

import com.app.dwbros.entities.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<Users,String> {
    @Query("Select u from Accounts a join Users u on a.accountId = u.accountId where a.accountId = :accountId")
    Users findByAccountId(String accountId);
}

package com.app.dwbros.repositories;

import com.app.dwbros.entities.Roles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Roles,String> {
    Roles findByRoleName(String roleName);
    @Query("SELECT r FROM Roles r JOIN Accounts a ON a.roleId = r.roleId where a.accountId =:accountId")
    Roles findByAccountId(String accountId);
}

package com.app.dwbros.repositories;

import com.app.dwbros.entities.Accounts;
import com.app.dwbros.entities.BillImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BilImagelRepository extends JpaRepository<BillImages,String>  {
}

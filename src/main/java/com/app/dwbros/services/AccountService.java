package com.app.dwbros.services;

import com.app.dwbros.dtos.AccountDTO;

import java.util.List;

public interface AccountService {
    List<AccountDTO> getAll();
    AccountDTO getOneById(String id);
    AccountDTO create(AccountDTO accountDTO);
    AccountDTO getOneByEmail(String email);
    AccountDTO update(AccountDTO accountDTO);
    void delete(String id);
}

package com.app.dwbros.services;

import com.app.dwbros.dtos.UserDTO;

import java.util.List;

public interface UserService {
    List<UserDTO> getAll();
    UserDTO getOneById(String id);
    UserDTO getOneByAccountId(String accountId);
    UserDTO update(String id);
    void delete(String id);
}

package com.app.dwbros.services;

import com.app.dwbros.dtos.RoleDTO;

import java.util.List;

public interface RoleService {
    List<RoleDTO> getAll();

    RoleDTO getOneByRoleName(String roleName);
    RoleDTO getOneById(String id);
    RoleDTO getOneByAccountId(String accountId);
    RoleDTO create(RoleDTO roleDTO);
    RoleDTO update(String id);
    void delete(String id);
}

package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.RoleDTO;
import com.app.dwbros.entities.Roles;
import com.app.dwbros.exceptions.DWBException;
import com.app.dwbros.exceptions.ResourceNotFoundException;
import com.app.dwbros.repositories.RoleRepository;
import com.app.dwbros.services.RoleService;
import com.app.dwbros.utils.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.app.dwbros.utils.SD.ROLE;

@Service
@RequiredArgsConstructor
public class RoleServiceImpl implements RoleService {
    private final RoleRepository roleRepository;
    @Override
    public List<RoleDTO> getAll() throws Exception {
        List<Roles> rolesList = roleRepository.findAll();
        if(rolesList.isEmpty()){
            throw new DWBException(HttpStatus.INTERNAL_SERVER_ERROR,"Role Data is empty");
        }
        return rolesList.stream().map(role -> EntityMapper.mapToDto(role, RoleDTO.class)).toList();
    }

    @Override
    public RoleDTO getOneByRoleName(String roleName) {
        Roles role = roleRepository.findByRoleName(roleName);
        if(role == null){
            throw new ResourceNotFoundException(ROLE,"role_name",roleName);
        }
        return EntityMapper.mapToDto(role, RoleDTO.class);
    }

    @Override
    public RoleDTO getOneById(String id) {
        Roles role = roleRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(ROLE,"id",id));
        return EntityMapper.mapToDto(role,RoleDTO.class);
    }

    @Override
    public RoleDTO getOneByAccountId(String accountId) {
        Roles role = roleRepository.findByAccountId(accountId);
        if(role != null){
            return EntityMapper.mapToDto(role,RoleDTO.class);
        }
        throw new DWBException(HttpStatus.BAD_REQUEST,"User Not Allowed");
    }

    @Override
    public RoleDTO create(RoleDTO roleDTO) {
        Roles role = new Roles();

        validateRoles(roleDTO);
            role.setRoleName(roleDTO.getRoleName());
            role = roleRepository.save(role);
            return EntityMapper.mapToDto(role,RoleDTO.class);
    }

    @Override
    public RoleDTO update(String id) {
        Roles role = roleRepository.findById(id).orElseThrow(()->new ResourceNotFoundException(ROLE,"id",id));
        RoleDTO roleDTO = EntityMapper.mapToDto(role,RoleDTO.class);
        validateRoles(roleDTO);
        role.setRoleName(roleDTO.getRoleName());
        return EntityMapper.mapToDto(roleRepository.save(role),RoleDTO.class);
    }

    @Override
    public void delete(String id) {
        Roles role = roleRepository.findById(id).orElseThrow(()->new ResourceNotFoundException(ROLE,"id",id));
        roleRepository.delete(role);
    }

    private boolean validateRoles(RoleDTO roleDTO){

        boolean roleNameIsExisted = roleRepository
                .findAll().stream()
                .map(Roles::getRoleName)
                .anyMatch(r->r.equals(roleDTO.getRoleName()));

        List<String> errorList = new ArrayList<>();
        if(roleDTO.getRoleName().isEmpty()){
            errorList.add("Role Name is required");
        }else if(roleNameIsExisted){
            errorList.add("Role Name is existed");
        }

        if(!errorList.isEmpty()){
            throw new DWBException(HttpStatus.BAD_REQUEST,errorList.toString());
        }
        return true;
    }
}

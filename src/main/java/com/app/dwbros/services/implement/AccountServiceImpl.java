package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.AccountDTO;
import com.app.dwbros.dtos.RoleDTO;
import com.app.dwbros.entities.Accounts;
import com.app.dwbros.exceptions.DWBException;
import com.app.dwbros.exceptions.ResourceNotFoundException;
import com.app.dwbros.repositories.AccountRepository;
import com.app.dwbros.services.AccountService;
import com.app.dwbros.services.RoleService;
import com.app.dwbros.utils.EntityMapper;
import jakarta.transaction.Transactional;
import org.springframework.http.HttpStatus;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

import static com.app.dwbros.utils.SD.ACCOUNT;

@Service
public class AccountServiceImpl implements AccountService {


    private AccountRepository accountRepository;
    private RoleService roleService;
    private BCryptPasswordEncoder passwordEncoder;

    @Override
    public List<AccountDTO> getAll() {
        return null;
    }

    @Override
    public AccountDTO getOneById(String id) {

        return null;
    }

    @Override
    public AccountDTO create(AccountDTO accountDTO) {
        List<String> errorList = new ArrayList<>();
        RoleDTO roleDTO;
        Accounts accounts = new Accounts();

        if(accountDTO.getEmail().isEmpty()){
            errorList.add("Email is required");
        }else if(accountDTO.getPassword().isEmpty()){
            errorList.add("Password is required");
        }

        if(!errorList.isEmpty()){
            throw new DWBException(HttpStatus.BAD_REQUEST,errorList.toString());
        }
        if (accountDTO.getRoleId().isEmpty()) {
            roleDTO = roleService.getOneByRoleName("CUSTOMER");
            accounts.setRoleId(roleDTO.getRoleId());
        }else{
            accounts.setRoleId(accountDTO.getRoleId());
        }
        accounts.setEmail(accountDTO.getEmail());
        accounts.setPassword(passwordEncoder.encode(accounts.getPassword()));
        Accounts newAccount = accountRepository.save(accounts);
        return EntityMapper.mapToDto(newAccount,AccountDTO.class);
    }

    @Override
    public AccountDTO getOneByEmail(String email) {
        Accounts accounts = accountRepository.findByEmail(email);
        if(accounts == null){
            throw new ResourceNotFoundException(ACCOUNT,"email",email);
        }
        return EntityMapper.mapToDto(accounts,AccountDTO.class);
    }

    @Override
    @Transactional
    public AccountDTO update(AccountDTO accountDTO) {
        String accountId = accountDTO.getAccountId();
        Accounts accounts = accountRepository.findById(accountId).orElseThrow(() -> new ResourceNotFoundException(ACCOUNT,"id",accountId));
        accounts.setEmail(accountDTO.getEmail() == null ? accounts.getEmail() : accountDTO.getEmail());
        accounts.setPassword(accountDTO.getPassword() == null ? accounts.getPassword() : passwordEncoder.encode(accountDTO.getPassword()));
        accounts.setRoleId(accountDTO.getRoleId() == null ? accounts.getRoleId() : accountDTO.getRoleId());
        accounts.setOauth(accountDTO.getOauth() == null ? accounts.getOauth() : accountDTO.getOauth());
        return EntityMapper.mapToDto(accountRepository.save(accounts), AccountDTO.class);
    }

    @Override
    public void delete(String id) {
        Accounts accounts = accountRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException(ACCOUNT,"id",id));
        accounts.set_deleted(true);
        accountRepository.save(accounts);
    }
}

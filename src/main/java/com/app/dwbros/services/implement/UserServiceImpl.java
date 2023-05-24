package com.app.dwbros.services.implement;

import com.app.dwbros.dtos.AccountDTO;
import com.app.dwbros.dtos.UserDTO;
import com.app.dwbros.entities.Users;
import com.app.dwbros.exceptions.ResourceNotFoundException;
import com.app.dwbros.repositories.UserRepository;
import com.app.dwbros.services.UserService;
import com.app.dwbros.utils.EntityMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.app.dwbros.utils.SD.ACCOUNT;
import static com.app.dwbros.utils.SD.USER;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;


    @Override
    public List<UserDTO> getAll() {
        return null;
    }

    @Override
    public UserDTO getOneById(String id) {
        return null;
    }

    @Override
    public UserDTO getOneByAccountId(String accountId) {
        Users user = userRepository.findByAccountId(accountId);
        if(user == null){
            throw new ResourceNotFoundException(ACCOUNT,"account_id",accountId);
        }else{
            return EntityMapper.mapToDto(user,UserDTO.class);
        }
    }

    @Override
    public UserDTO update(String id) {
        return null;
    }

    @Override
    public void delete(String id) {

    }
}

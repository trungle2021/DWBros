package com.app.dwbros.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDTO {
    private String userId;
    private String name;
    private Integer age;
    private String accountId;
    private boolean is_deleted;
    private boolean is_verified;
    private Collection<FavoriteCuisineDTO> favoriteCuisinesByUserId;
    private AccountDTO accountsByAccountId;
}

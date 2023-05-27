package com.app.dwbros.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class FavoriteCuisinesPK implements Serializable {
    @Column(name = "user_id", nullable = false, length = 36)
    @Id
    private String userId;
    @Column(name = "cuisine_id", nullable = false, length = 36)
    @Id
    private String cuisineId;


}

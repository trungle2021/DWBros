package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "favorite_cuisines", schema = "dwbros")
@IdClass(FavoriteCuisinesPK.class)
public class FavoriteCuisines {
    @Id
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @Id
    @Column(name = "cuisine_id", nullable = false, length = 36)
    private String cuisineId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false,insertable = false,updatable = false)
    private Users usersByUserId;
    @ManyToOne
    @JoinColumn(name = "cuisine_id", referencedColumnName = "cusine_id", nullable = false,insertable = false,updatable = false)
    private Cuisines cuisinesByCuisineId;

}

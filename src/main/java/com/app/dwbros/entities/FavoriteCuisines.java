package com.app.dwbros.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "favorite_cuisines", schema = "dwbros", catalog = "")
@IdClass(FavoriteCuisinesPK.class)
public class FavoriteCuisines {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cuisine_id", nullable = false, length = 36)
    private String cuisineId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false,insertable = false,updatable = false)
    private Users usersByUserId;
    @ManyToOne
    @JoinColumn(name = "cuisine_id", referencedColumnName = "cusine_id", nullable = false,insertable = false,updatable = false)
    private Cuisines cuisinesByCuisineId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getCuisineId() {
        return cuisineId;
    }

    public void setCuisineId(String cuisineId) {
        this.cuisineId = cuisineId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FavoriteCuisines that = (FavoriteCuisines) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (cuisineId != null ? !cuisineId.equals(that.cuisineId) : that.cuisineId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (cuisineId != null ? cuisineId.hashCode() : 0);
        return result;
    }

    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    public Cuisines getCuisinesByCuisineId() {
        return cuisinesByCuisineId;
    }

    public void setCuisinesByCuisineId(Cuisines cuisinesByCuisineId) {
        this.cuisinesByCuisineId = cuisinesByCuisineId;
    }
}

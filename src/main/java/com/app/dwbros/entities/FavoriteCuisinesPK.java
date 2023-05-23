package com.app.dwbros.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class FavoriteCuisinesPK implements Serializable {
    @Column(name = "user_id", nullable = false, length = 36)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;
    @Column(name = "cuisine_id", nullable = false, length = 36)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String cuisineId;

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

        FavoriteCuisinesPK that = (FavoriteCuisinesPK) o;

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
}

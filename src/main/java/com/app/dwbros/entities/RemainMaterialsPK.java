package com.app.dwbros.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.io.Serializable;

public class RemainMaterialsPK implements Serializable {
    @Column(name = "material_id", nullable = false, length = 36)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String materialId;
    @Column(name = "user_id", nullable = false, length = 36)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String userId;

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemainMaterialsPK that = (RemainMaterialsPK) o;

        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;
        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId != null ? materialId.hashCode() : 0;
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }
}

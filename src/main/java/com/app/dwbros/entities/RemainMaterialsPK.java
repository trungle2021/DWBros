package com.app.dwbros.entities;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.io.Serializable;
@Data
public class RemainMaterialsPK implements Serializable {
    @Column(name = "material_id", nullable = false, length = 36)
    @Id
    private String materialId;
    @Column(name = "user_id", nullable = false, length = 36)
    @Id
    private String userId;

}

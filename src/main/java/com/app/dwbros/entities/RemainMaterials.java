package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "remain_materials", schema = "dwbros")
@IdClass(RemainMaterialsPK.class)
public class RemainMaterials {
    @Id
    @Column(name = "material_id", nullable = false, length = 36)
    private String materialId;
    @Id
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @ManyToOne
    @JoinColumn(name = "material_id", referencedColumnName = "material_id", nullable = false,insertable = false,updatable = false)
    private Materials materialsByMaterialId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false,insertable = false,updatable = false)
    private Users usersByUserId;

}

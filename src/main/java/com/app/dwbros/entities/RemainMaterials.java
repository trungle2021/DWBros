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
public class RemainMaterials {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "remain_material_id", nullable = false, length = 36)
    private String remainMaterialId;
    @Basic
    @Column(name = "material_id", nullable = true, length = 36)
    private String materialId;
    @ManyToOne
    @JoinColumn(name = "material_id", referencedColumnName = "material_id",insertable=false, updatable=false)
    private Materials materialsByMaterialId;


}

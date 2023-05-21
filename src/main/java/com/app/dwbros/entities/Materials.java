package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Collection;
import java.util.HashSet;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Materials {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "material_id", nullable = false, length = 36,insertable=false, updatable=false)
    private String materialId;
    @Basic
    @Column(name = "material_name", nullable = true, length = 50)
    private String materialName;
    @Basic
    @Column(name = "images", nullable = true, length = 100)
    private String images;
    @OneToMany(mappedBy = "materialsByMaterialId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<RecipeDetails> recipeDetailsByMaterialId = new HashSet<>();
    @OneToMany(mappedBy = "materialsByMaterialId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<RemainMaterials> remainMaterialsByMaterialId= new HashSet<>() ;
}

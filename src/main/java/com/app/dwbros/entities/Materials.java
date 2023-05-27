package com.app.dwbros.entities;

import entities1545.MaterialsCategories;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Materials {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "material_id", nullable = false, length = 36)
    private String materialId;
    @Basic
    @Column(name = "images", nullable = true, length = 100)
    private String images;
    @Basic
    @Column(name = "material_name", nullable = true, length = 50)
    private String materialName;

    @Basic
    @Column(name = "unit", nullable = true, length = 20)
    private String unit;

    @Basic
    @Column(name = "calories", nullable = true, precision = 2)
    private Double calories;

    @Basic
    @Column(name = "weight", nullable = true, precision = 2)
    private Double weight;

    @Basic
    @Column(name = "qty", nullable = true, precision = 2)
    private Double qty;

    @ManyToOne
    @JoinColumn(name = "material_category_id", referencedColumnName = "category_id", nullable = false)
    private MaterialsCategories materialsCategoriesByMaterialCategoryId;
    @OneToMany(mappedBy = "materialsByMaterialId")
    private Collection<RecipeDetails> recipeDetailsByMaterialId;
    @OneToMany(mappedBy = "materialsByMaterialId")
    private Collection<RemainMaterials> remainMaterialsByMaterialId;


}

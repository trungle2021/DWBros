package com.app.dwbros.entities;

import entities1545.Materials;
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
@Table(name = "materials_categories", schema = "dwbros")
public class MaterialsCategories {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "category_id", nullable = false, length = 36)
    private String categoryId;
    @Basic
    @Column(name = "category_name", nullable = true, length = 50)
    private String categoryName;

    @Basic
    @Column(name = "calories_per_gram", nullable = true, precision = 2)
    private Double caloriesPerGram;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @OneToMany(mappedBy = "materialsCategoriesByMaterialCategoryId")
    private Collection<Materials> materialsByCategoryId;

}

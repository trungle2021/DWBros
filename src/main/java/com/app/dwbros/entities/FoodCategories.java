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
public class FoodCategories {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "category_id", nullable = false, length = 36)
    private String categoryId;
    @Basic
    @Column(name = "category_name", nullable = true, length = 50)
    private String categoryName;
    @OneToMany(mappedBy = "foodCategoriesByCategoryId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<FoodTypes> foodTypesByCategoryId = new HashSet<>();


}

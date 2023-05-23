package com.app.dwbros.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
@Table(name = "food_categories", schema = "dwbros", catalog = "")
public class FoodCategories {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id", nullable = false, length = 36)
    private String categoryId;
    @Basic
    @Column(name = "category_name", nullable = true, length = 50)
    private String categoryName;
    @OneToMany(mappedBy = "foodCategoriesByCategoryId")
    private Collection<FoodTypes> foodTypesByCategoryId;

    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(String categoryId) {
        this.categoryId = categoryId;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FoodCategories that = (FoodCategories) o;

        if (categoryId != null ? !categoryId.equals(that.categoryId) : that.categoryId != null) return false;
        if (categoryName != null ? !categoryName.equals(that.categoryName) : that.categoryName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = categoryId != null ? categoryId.hashCode() : 0;
        result = 31 * result + (categoryName != null ? categoryName.hashCode() : 0);
        return result;
    }

    public Collection<FoodTypes> getFoodTypesByCategoryId() {
        return foodTypesByCategoryId;
    }

    public void setFoodTypesByCategoryId(Collection<FoodTypes> foodTypesByCategoryId) {
        this.foodTypesByCategoryId = foodTypesByCategoryId;
    }
}

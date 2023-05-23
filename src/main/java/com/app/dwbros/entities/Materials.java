package com.app.dwbros.entities;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Materials {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "material_id", nullable = false, length = 36)
    private String materialId;
    @Basic
    @Column(name = "images", nullable = true, length = 100)
    private String images;
    @Basic
    @Column(name = "material_name", nullable = true, length = 50)
    private String materialName;
    @OneToMany(mappedBy = "materialsByMaterialId")
    private Collection<RecipeDetails> recipeDetailsByMaterialId;
    @OneToMany(mappedBy = "materialsByMaterialId")
    private Collection<RemainMaterials> remainMaterialsByMaterialId;

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    public String getImages() {
        return images;
    }

    public void setImages(String images) {
        this.images = images;
    }

    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Materials materials = (Materials) o;

        if (materialId != null ? !materialId.equals(materials.materialId) : materials.materialId != null) return false;
        if (images != null ? !images.equals(materials.images) : materials.images != null) return false;
        if (materialName != null ? !materialName.equals(materials.materialName) : materials.materialName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId != null ? materialId.hashCode() : 0;
        result = 31 * result + (images != null ? images.hashCode() : 0);
        result = 31 * result + (materialName != null ? materialName.hashCode() : 0);
        return result;
    }

    public Collection<RecipeDetails> getRecipeDetailsByMaterialId() {
        return recipeDetailsByMaterialId;
    }

    public void setRecipeDetailsByMaterialId(Collection<RecipeDetails> recipeDetailsByMaterialId) {
        this.recipeDetailsByMaterialId = recipeDetailsByMaterialId;
    }

    public Collection<RemainMaterials> getRemainMaterialsByMaterialId() {
        return remainMaterialsByMaterialId;
    }

    public void setRemainMaterialsByMaterialId(Collection<RemainMaterials> remainMaterialsByMaterialId) {
        this.remainMaterialsByMaterialId = remainMaterialsByMaterialId;
    }
}

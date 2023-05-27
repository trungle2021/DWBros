package entities1545;

import jakarta.persistence.*;

import java.math.BigDecimal;
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
    @Basic
    @Column(name = "unit", nullable = true, length = 20)
    private String unit;
    @Basic
    @Column(name = "calories", nullable = true, precision = 2)
    private BigDecimal calories;
    @Basic
    @Column(name = "weight", nullable = true, precision = 2)
    private BigDecimal weight;
    @Basic
    @Column(name = "qty", nullable = true, precision = 2)
    private BigDecimal qty;
    @Basic
    @Column(name = "material_category_id", nullable = false, length = 36)
    private String materialCategoryId;
    @ManyToOne
    @JoinColumn(name = "material_category_id", referencedColumnName = "category_id", nullable = false)
    private MaterialsCategories materialsCategoriesByMaterialCategoryId;
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

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public BigDecimal getCalories() {
        return calories;
    }

    public void setCalories(BigDecimal calories) {
        this.calories = calories;
    }

    public BigDecimal getWeight() {
        return weight;
    }

    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    public BigDecimal getQty() {
        return qty;
    }

    public void setQty(BigDecimal qty) {
        this.qty = qty;
    }

    public String getMaterialCategoryId() {
        return materialCategoryId;
    }

    public void setMaterialCategoryId(String materialCategoryId) {
        this.materialCategoryId = materialCategoryId;
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
        if (unit != null ? !unit.equals(materials.unit) : materials.unit != null) return false;
        if (calories != null ? !calories.equals(materials.calories) : materials.calories != null) return false;
        if (weight != null ? !weight.equals(materials.weight) : materials.weight != null) return false;
        if (qty != null ? !qty.equals(materials.qty) : materials.qty != null) return false;
        if (materialCategoryId != null ? !materialCategoryId.equals(materials.materialCategoryId) : materials.materialCategoryId != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = materialId != null ? materialId.hashCode() : 0;
        result = 31 * result + (images != null ? images.hashCode() : 0);
        result = 31 * result + (materialName != null ? materialName.hashCode() : 0);
        result = 31 * result + (unit != null ? unit.hashCode() : 0);
        result = 31 * result + (calories != null ? calories.hashCode() : 0);
        result = 31 * result + (weight != null ? weight.hashCode() : 0);
        result = 31 * result + (qty != null ? qty.hashCode() : 0);
        result = 31 * result + (materialCategoryId != null ? materialCategoryId.hashCode() : 0);
        return result;
    }

    public MaterialsCategories getMaterialsCategoriesByMaterialCategoryId() {
        return materialsCategoriesByMaterialCategoryId;
    }

    public void setMaterialsCategoriesByMaterialCategoryId(MaterialsCategories materialsCategoriesByMaterialCategoryId) {
        this.materialsCategoriesByMaterialCategoryId = materialsCategoriesByMaterialCategoryId;
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

package entities1545;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Collection;

@Entity
@Table(name = "materials_categories", schema = "dwbros", catalog = "")
public class MaterialsCategories {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "category_id", nullable = false, length = 36)
    private String categoryId;
    @Basic
    @Column(name = "category_name", nullable = true, length = 50)
    private String categoryName;
    @Basic
    @Column(name = "calories_per_gram", nullable = true, precision = 2)
    private BigDecimal caloriesPerGram;
    @Basic
    @Column(name = "description", nullable = true, length = -1)
    private String description;
    @OneToMany(mappedBy = "materialsCategoriesByMaterialCategoryId")
    private Collection<Materials> materialsByCategoryId;

}

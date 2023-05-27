package entities1545;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Cuisines {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "cusine_id", nullable = false, length = 36)
    private String cusineId;
    @Basic
    @Column(name = "cuisine_name", nullable = true, length = 50)
    private String cuisineName;
    @OneToMany(mappedBy = "cuisinesByCuisineId")
    private Collection<FavoriteCuisines> favoriteCuisinesByCusineId;
    @OneToMany(mappedBy = "cuisinesByCuisineId")
    private Collection<Food> foodsByCusineId;

    public String getCusineId() {
        return cusineId;
    }

    public void setCusineId(String cusineId) {
        this.cusineId = cusineId;
    }

    public String getCuisineName() {
        return cuisineName;
    }

    public void setCuisineName(String cuisineName) {
        this.cuisineName = cuisineName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cuisines cuisines = (Cuisines) o;

        if (cusineId != null ? !cusineId.equals(cuisines.cusineId) : cuisines.cusineId != null) return false;
        if (cuisineName != null ? !cuisineName.equals(cuisines.cuisineName) : cuisines.cuisineName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cusineId != null ? cusineId.hashCode() : 0;
        result = 31 * result + (cuisineName != null ? cuisineName.hashCode() : 0);
        return result;
    }

    public Collection<FavoriteCuisines> getFavoriteCuisinesByCusineId() {
        return favoriteCuisinesByCusineId;
    }

    public void setFavoriteCuisinesByCusineId(Collection<FavoriteCuisines> favoriteCuisinesByCusineId) {
        this.favoriteCuisinesByCusineId = favoriteCuisinesByCusineId;
    }

    public Collection<Food> getFoodsByCusineId() {
        return foodsByCusineId;
    }

    public void setFoodsByCusineId(Collection<Food> foodsByCusineId) {
        this.foodsByCusineId = foodsByCusineId;
    }
}

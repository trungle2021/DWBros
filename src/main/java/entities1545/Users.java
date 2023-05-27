package entities1545;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Users {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @Basic
    @Column(name = "account_id", nullable = true, length = 36)
    private String accountId;
    @Basic
    @Column(name = "age", nullable = true)
    private Integer age;
    @Basic
    @Column(name = "is_deleted", nullable = true)
    private Boolean isDeleted;
    @Basic
    @Column(name = "is_verified", nullable = true)
    private Boolean isVerified;
    @Basic
    @Column(name = "name", nullable = true, length = 50)
    private String name;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<Bills> billsByUserId;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<FavoriteCuisines> favoriteCuisinesByUserId;
    @OneToMany(mappedBy = "usersByUserId")
    private Collection<RemainMaterials> remainMaterialsByUserId;
    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    private Accounts accountsByAccountId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Boolean getVerified() {
        return isVerified;
    }

    public void setVerified(Boolean verified) {
        isVerified = verified;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Users users = (Users) o;

        if (userId != null ? !userId.equals(users.userId) : users.userId != null) return false;
        if (accountId != null ? !accountId.equals(users.accountId) : users.accountId != null) return false;
        if (age != null ? !age.equals(users.age) : users.age != null) return false;
        if (isDeleted != null ? !isDeleted.equals(users.isDeleted) : users.isDeleted != null) return false;
        if (isVerified != null ? !isVerified.equals(users.isVerified) : users.isVerified != null) return false;
        if (name != null ? !name.equals(users.name) : users.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (accountId != null ? accountId.hashCode() : 0);
        result = 31 * result + (age != null ? age.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (isVerified != null ? isVerified.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public Collection<Bills> getBillsByUserId() {
        return billsByUserId;
    }

    public void setBillsByUserId(Collection<Bills> billsByUserId) {
        this.billsByUserId = billsByUserId;
    }

    public Collection<FavoriteCuisines> getFavoriteCuisinesByUserId() {
        return favoriteCuisinesByUserId;
    }

    public void setFavoriteCuisinesByUserId(Collection<FavoriteCuisines> favoriteCuisinesByUserId) {
        this.favoriteCuisinesByUserId = favoriteCuisinesByUserId;
    }

    public Collection<RemainMaterials> getRemainMaterialsByUserId() {
        return remainMaterialsByUserId;
    }

    public void setRemainMaterialsByUserId(Collection<RemainMaterials> remainMaterialsByUserId) {
        this.remainMaterialsByUserId = remainMaterialsByUserId;
    }

    public Accounts getAccountsByAccountId() {
        return accountsByAccountId;
    }

    public void setAccountsByAccountId(Accounts accountsByAccountId) {
        this.accountsByAccountId = accountsByAccountId;
    }
}

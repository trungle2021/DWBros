package entities1545;

import jakarta.persistence.*;

@Entity
@Table(name = "remain_materials", schema = "dwbros", catalog = "")
@IdClass(RemainMaterialsPK.class)
public class RemainMaterials {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "material_id", nullable = false, length = 36)
    private String materialId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private Users usersByUserId;
    @ManyToOne
    @JoinColumn(name = "material_id", referencedColumnName = "material_id", nullable = false)
    private Materials materialsByMaterialId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getMaterialId() {
        return materialId;
    }

    public void setMaterialId(String materialId) {
        this.materialId = materialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RemainMaterials that = (RemainMaterials) o;

        if (userId != null ? !userId.equals(that.userId) : that.userId != null) return false;
        if (materialId != null ? !materialId.equals(that.materialId) : that.materialId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userId != null ? userId.hashCode() : 0;
        result = 31 * result + (materialId != null ? materialId.hashCode() : 0);
        return result;
    }

    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }

    public Materials getMaterialsByMaterialId() {
        return materialsByMaterialId;
    }

    public void setMaterialsByMaterialId(Materials materialsByMaterialId) {
        this.materialsByMaterialId = materialsByMaterialId;
    }
}

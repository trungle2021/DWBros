package entities1545;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Roles {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "role_id", nullable = false, length = 36)
    private String roleId;
    @Basic
    @Column(name = "role_name", nullable = true, length = 50)
    private String roleName;
    @OneToMany(mappedBy = "rolesByRoleId")
    private Collection<Accounts> accountsByRoleId;

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Roles roles = (Roles) o;

        if (roleId != null ? !roleId.equals(roles.roleId) : roles.roleId != null) return false;
        if (roleName != null ? !roleName.equals(roles.roleName) : roles.roleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = roleId != null ? roleId.hashCode() : 0;
        result = 31 * result + (roleName != null ? roleName.hashCode() : 0);
        return result;
    }

    public Collection<Accounts> getAccountsByRoleId() {
        return accountsByRoleId;
    }

    public void setAccountsByRoleId(Collection<Accounts> accountsByRoleId) {
        this.accountsByRoleId = accountsByRoleId;
    }
}

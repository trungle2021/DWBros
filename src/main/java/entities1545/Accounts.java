package entities1545;

import jakarta.persistence.*;

import java.util.Collection;

@Entity
public class Accounts {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "account_id", nullable = false, length = 36)
    private String accountId;
    @Basic
    @Column(name = "email", nullable = true, length = 100)
    private String email;
    @Basic
    @Column(name = "is_deleted", nullable = true)
    private Boolean isDeleted;
    @Basic
    @Column(name = "oauth", nullable = true, length = 100)
    private String oauth;
    @Basic
    @Column(name = "password", nullable = true, length = 100)
    private String password;
    @Basic
    @Column(name = "role_id", nullable = true, length = 36)
    private String roleId;
    @ManyToOne
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private Roles rolesByRoleId;
    @OneToMany(mappedBy = "accountsByAccountId")
    private Collection<Users> usersByAccountId;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public String getOauth() {
        return oauth;
    }

    public void setOauth(String oauth) {
        this.oauth = oauth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Accounts accounts = (Accounts) o;

        if (accountId != null ? !accountId.equals(accounts.accountId) : accounts.accountId != null) return false;
        if (email != null ? !email.equals(accounts.email) : accounts.email != null) return false;
        if (isDeleted != null ? !isDeleted.equals(accounts.isDeleted) : accounts.isDeleted != null) return false;
        if (oauth != null ? !oauth.equals(accounts.oauth) : accounts.oauth != null) return false;
        if (password != null ? !password.equals(accounts.password) : accounts.password != null) return false;
        if (roleId != null ? !roleId.equals(accounts.roleId) : accounts.roleId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accountId != null ? accountId.hashCode() : 0;
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (isDeleted != null ? isDeleted.hashCode() : 0);
        result = 31 * result + (oauth != null ? oauth.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (roleId != null ? roleId.hashCode() : 0);
        return result;
    }

    public Roles getRolesByRoleId() {
        return rolesByRoleId;
    }

    public void setRolesByRoleId(Roles rolesByRoleId) {
        this.rolesByRoleId = rolesByRoleId;
    }

    public Collection<Users> getUsersByAccountId() {
        return usersByAccountId;
    }

    public void setUsersByAccountId(Collection<Users> usersByAccountId) {
        this.usersByAccountId = usersByAccountId;
    }
}

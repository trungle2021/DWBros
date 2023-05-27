package entities1545;

import jakarta.persistence.*;

import java.sql.Date;
import java.util.Collection;

@Entity
public class Bills {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "bill_id", nullable = false, length = 36)
    private String billId;
    @Basic
    @Column(name = "bill_amount", nullable = true, precision = 0)
    private Double billAmount;
    @Basic
    @Column(name = "bill_date", nullable = true)
    private Date billDate;
    @Basic
    @Column(name = "user_id", nullable = false, length = 36)
    private String userId;
    @OneToMany(mappedBy = "billsByBillId")
    private Collection<BillImages> billImagesByBillId;
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false)
    private Users usersByUserId;

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public Double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(Double billAmount) {
        this.billAmount = billAmount;
    }

    public Date getBillDate() {
        return billDate;
    }

    public void setBillDate(Date billDate) {
        this.billDate = billDate;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Bills bills = (Bills) o;

        if (billId != null ? !billId.equals(bills.billId) : bills.billId != null) return false;
        if (billAmount != null ? !billAmount.equals(bills.billAmount) : bills.billAmount != null) return false;
        if (billDate != null ? !billDate.equals(bills.billDate) : bills.billDate != null) return false;
        if (userId != null ? !userId.equals(bills.userId) : bills.userId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billId != null ? billId.hashCode() : 0;
        result = 31 * result + (billAmount != null ? billAmount.hashCode() : 0);
        result = 31 * result + (billDate != null ? billDate.hashCode() : 0);
        result = 31 * result + (userId != null ? userId.hashCode() : 0);
        return result;
    }

    public Collection<BillImages> getBillImagesByBillId() {
        return billImagesByBillId;
    }

    public void setBillImagesByBillId(Collection<BillImages> billImagesByBillId) {
        this.billImagesByBillId = billImagesByBillId;
    }

    public Users getUsersByUserId() {
        return usersByUserId;
    }

    public void setUsersByUserId(Users usersByUserId) {
        this.usersByUserId = usersByUserId;
    }
}

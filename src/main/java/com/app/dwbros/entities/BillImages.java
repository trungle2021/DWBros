package com.app.dwbros.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "bill_images", schema = "dwbros", catalog = "")
public class BillImages {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "bill_image_id", nullable = false, length = 36)
    private String billImageId;
    @Basic
    @Column(name = "bill_id", nullable = true, length = 36)
    private String billId;
    @Basic
    @Column(name = "image", nullable = true, length = 100)
    private String image;
    @ManyToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "bill_id",insertable = false,updatable = false)
    private Bills billsByBillId;

    public String getBillImageId() {
        return billImageId;
    }

    public void setBillImageId(String billImageId) {
        this.billImageId = billImageId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BillImages that = (BillImages) o;

        if (billImageId != null ? !billImageId.equals(that.billImageId) : that.billImageId != null) return false;
        if (billId != null ? !billId.equals(that.billId) : that.billId != null) return false;
        if (image != null ? !image.equals(that.image) : that.image != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = billImageId != null ? billImageId.hashCode() : 0;
        result = 31 * result + (billId != null ? billId.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        return result;
    }

    public Bills getBillsByBillId() {
        return billsByBillId;
    }

    public void setBillsByBillId(Bills billsByBillId) {
        this.billsByBillId = billsByBillId;
    }
}

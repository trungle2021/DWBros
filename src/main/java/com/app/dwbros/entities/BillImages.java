package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillImages {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "bill_image_id", nullable = false, length = 36)
    private String billImageId;
    @Basic
    @Column(name = "image", nullable = true, length = 100)
    private String image;
    @Basic
    @Column(name = "bill_id", nullable = true, length = 36)
    private String billId;
    @ManyToOne
    @JoinColumn(name = "bill_id", referencedColumnName = "bill_id",insertable=false, updatable=false)
    private Bills billsByBillId;


}

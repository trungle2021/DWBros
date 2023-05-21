package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Collection;
import java.util.HashSet;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Bills {
    @GeneratedValue(strategy = GenerationType.UUID)
    @Id
    @Column(name = "bill_id", nullable = false, length = 36)
    private String billId;
    @Basic
    @Column(name = "bill_date", nullable = true)
    private Date billDate;
    @Basic
    @Column(name = "bill_amount", nullable = true, precision = 0)
    private Double billAmount;
    @OneToMany(mappedBy = "billsByBillId",cascade = CascadeType.ALL,orphanRemoval = true)
    private Collection<BillImages> billImagesByBillId = new HashSet<>();


}

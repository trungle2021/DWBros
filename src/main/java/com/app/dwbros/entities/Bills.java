package com.app.dwbros.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Collection;

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
    @JoinColumn(name = "user_id", referencedColumnName = "user_id", nullable = false,insertable = false,updatable = false)
    private Users usersByUserId;

}

package com.app.dwbros.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;
import java.util.Collection;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class BillDTO {
    private String billId;
    private Date billDate;
    private Double billAmount;
    private Collection<BillImageDTO> billImagesByBillId;
}

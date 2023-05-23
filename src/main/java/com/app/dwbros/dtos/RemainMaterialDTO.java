package com.app.dwbros.dtos;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RemainMaterialDTO {
    private String remainMaterialId;
    private String materialId;
    private String userId;
    private MaterialDTO materialsByMaterialId;

}

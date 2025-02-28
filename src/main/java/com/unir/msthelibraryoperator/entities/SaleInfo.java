package com.unir.msthelibraryoperator.entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "sale_info")
public class SaleInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private String saleability;
    private Boolean isEbook;
}
package com.unir.msthelibraryoperator.dtos.request;
import lombok.Data;

@Data
public class SaleInfoDTO {
    private String country;
    private String saleability;
    private Boolean isEbook;
}
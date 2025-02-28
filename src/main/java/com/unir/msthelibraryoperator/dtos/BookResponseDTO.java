package com.unir.msthelibraryoperator.dtos;

import lombok.Data;

@Data
public class BookResponseDTO {
    private String kind;
    private Long totalItems;
    private Object[] items;

    public BookResponseDTO(String kind, Long totalItems, Object[] items) {
        this.kind = kind;
        this.totalItems = totalItems;
        this.items = items;
    }
}

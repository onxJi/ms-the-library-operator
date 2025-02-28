package com.unir.msthelibraryoperator.entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "image_links")
public class ImageLinks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String smallThumbnail;
    private String thumbnail;
}
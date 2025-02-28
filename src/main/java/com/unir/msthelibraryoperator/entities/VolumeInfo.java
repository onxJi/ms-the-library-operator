package com.unir.msthelibraryoperator.entities;
import jakarta.persistence.*;
import lombok.Data;
import java.util.List;

@Data
@Entity
@Table(name = "volume_info")
public class VolumeInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String publishedDate;
    private String description;
    private Integer pageCount;
    private String printType;
    private String maturityRating;
    private Boolean allowAnonLogging;
    private String contentVersion;
    private String bookLanguage;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;

    @ElementCollection
    @CollectionTable(name = "volume_authors", joinColumns = @JoinColumn(name = "volume_info_id"))
    @Column(name = "author") // Especifica explícitamente el nombre de la columna
    private List<String> authors;

    @OneToMany(mappedBy = "volumeInfo", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<IndustryIdentifier> industryIdentifiers;

    @ElementCollection
    @CollectionTable(name = "volume_categories", joinColumns = @JoinColumn(name = "volume_info_id"))
    @Column(name = "categories")
    private List<String> categories;

    @OneToOne(cascade = CascadeType.ALL, orphanRemoval = true)
    @JoinColumn(name = "image_links_id")
    private ImageLinks imageLinks;
}
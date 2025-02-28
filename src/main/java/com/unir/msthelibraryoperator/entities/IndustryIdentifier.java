package com.unir.msthelibraryoperator.entities;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "industry_identifiers")
public class IndustryIdentifier {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String type;
    private String identifier;

    @ManyToOne
    @JoinColumn(name = "volume_info_id")
    @JsonManagedReference
    private VolumeInfo volumeInfo;
}

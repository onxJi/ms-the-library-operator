package com.unir.msthelibraryoperator.entities;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "access_info")
public class AccessInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String country;
    private String viewability;
    private Boolean embeddable;
    private Boolean publicDomain;
    private String textToSpeechPermission;
    private Boolean epubAvailable;
    private Boolean pdfAvailable;
    private String webReaderLink;
    private String accessViewStatus;
    private Boolean quoteSharingAllowed;
}

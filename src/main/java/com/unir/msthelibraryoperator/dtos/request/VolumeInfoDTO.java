package com.unir.msthelibraryoperator.dtos.request;
import lombok.Data;
import java.util.List;

@Data
public class VolumeInfoDTO {
    private String title;
    private List<String> authors;
    private String publishedDate;
    private String description;
    private List<IndustryIdentifierDTO> industryIdentifiers;
    private Integer pageCount;
    private String printType;
    private List<String> categories;
    private String maturityRating;
    private Boolean allowAnonLogging;
    private String contentVersion;
    private ImageLinksDTO imageLinks;
    private String language;
    private String previewLink;
    private String infoLink;
    private String canonicalVolumeLink;
}

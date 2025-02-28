package com.unir.msthelibraryoperator.dtos.request;
import lombok.Data;

@Data
public class AccessInfoDTO {
    private String country;
    private String viewability;
    private Boolean embeddable;
    private Boolean publicDomain;
    private String textToSpeechPermission;
    private Boolean epub;
    private Boolean pdf;
    private String webReaderLink;
    private String accessViewStatus;
    private Boolean quoteSharingAllowed;
}
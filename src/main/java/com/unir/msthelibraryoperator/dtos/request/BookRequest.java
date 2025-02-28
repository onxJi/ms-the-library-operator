package com.unir.msthelibraryoperator.dtos.request;

import lombok.Data;
import java.util.List;

@Data
public class BookRequest {
    private String kind;
    private String id;
    private String etag;
    private String selfLink;
    private VolumeInfoDTO volumeInfo;
    private SaleInfoDTO saleInfo;
    private AccessInfoDTO accessInfo;
}

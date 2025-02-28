package com.unir.msthelibraryoperator.services;
import com.unir.msthelibraryoperator.dtos.request.*;
import com.unir.msthelibraryoperator.entities.*;
import org.springframework.stereotype.Service;

@Service
public class BookMapperService {

    public Book mapToEntity(BookRequest bookRequest) {
        Book book = new Book();
        book.setKind(bookRequest.getKind());
        book.setEtag(bookRequest.getEtag());
        book.setSelfLink(bookRequest.getSelfLink());

        // Volume Info
        VolumeInfo volumeInfo = new VolumeInfo();
        volumeInfo.setTitle(bookRequest.getVolumeInfo().getTitle());
        volumeInfo.setPublishedDate(bookRequest.getVolumeInfo().getPublishedDate());
        volumeInfo.setDescription(bookRequest.getVolumeInfo().getDescription());
        volumeInfo.setPageCount(bookRequest.getVolumeInfo().getPageCount());
        volumeInfo.setPrintType(bookRequest.getVolumeInfo().getPrintType());
        volumeInfo.setMaturityRating(bookRequest.getVolumeInfo().getMaturityRating());
        volumeInfo.setAllowAnonLogging(bookRequest.getVolumeInfo().getAllowAnonLogging());
        volumeInfo.setContentVersion(bookRequest.getVolumeInfo().getContentVersion());
        volumeInfo.setBookLanguage(bookRequest.getVolumeInfo().getLanguage());
        volumeInfo.setPreviewLink(bookRequest.getVolumeInfo().getPreviewLink());
        volumeInfo.setInfoLink(bookRequest.getVolumeInfo().getInfoLink());
        volumeInfo.setCanonicalVolumeLink(bookRequest.getVolumeInfo().getCanonicalVolumeLink());

        // Authors
        volumeInfo.setAuthors(bookRequest.getVolumeInfo().getAuthors());

        // Industry Identifiers
        volumeInfo.setIndustryIdentifiers(bookRequest.getVolumeInfo().getIndustryIdentifiers().stream()
                .map(ind -> {
                    IndustryIdentifier identifier = new IndustryIdentifier();
                    identifier.setType(ind.getType());
                    identifier.setIdentifier(ind.getIdentifier());
                    return identifier;
                })
                .toList());

        // Categories
        volumeInfo.setCategories(bookRequest.getVolumeInfo().getCategories());

        // Image Links
        ImageLinks imageLinks = new ImageLinks();
        imageLinks.setSmallThumbnail(bookRequest.getVolumeInfo().getImageLinks().getSmallThumbnail());
        imageLinks.setThumbnail(bookRequest.getVolumeInfo().getImageLinks().getThumbnail());
        volumeInfo.setImageLinks(imageLinks);

        // Asignar VolumeInfo al libro
        book.setVolumeInfo(volumeInfo);

        // Sale Info
        SaleInfo saleInfo = new SaleInfo();
        saleInfo.setCountry(bookRequest.getSaleInfo().getCountry());
        saleInfo.setSaleability(bookRequest.getSaleInfo().getSaleability());
        saleInfo.setIsEbook(bookRequest.getSaleInfo().getIsEbook());
        book.setSaleInfo(saleInfo);

        // Access Info
        AccessInfo accessInfo = new AccessInfo();
        accessInfo.setCountry(bookRequest.getAccessInfo().getCountry());
        accessInfo.setViewability(bookRequest.getAccessInfo().getViewability());
        accessInfo.setEmbeddable(bookRequest.getAccessInfo().getEmbeddable());
        accessInfo.setPublicDomain(bookRequest.getAccessInfo().getPublicDomain());
        accessInfo.setTextToSpeechPermission(bookRequest.getAccessInfo().getTextToSpeechPermission());
        accessInfo.setEpubAvailable(bookRequest.getAccessInfo().getEpub());
        accessInfo.setPdfAvailable(bookRequest.getAccessInfo().getPdf());
        accessInfo.setWebReaderLink(bookRequest.getAccessInfo().getWebReaderLink());
        accessInfo.setAccessViewStatus(bookRequest.getAccessInfo().getAccessViewStatus());
        accessInfo.setQuoteSharingAllowed(bookRequest.getAccessInfo().getQuoteSharingAllowed());
        book.setAccessInfo(accessInfo);

        return book;
    }
}

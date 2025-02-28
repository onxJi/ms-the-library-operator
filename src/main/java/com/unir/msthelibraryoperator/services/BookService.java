package com.unir.msthelibraryoperator.services;

import com.unir.msthelibraryoperator.dtos.BookResponseDTO;
import com.unir.msthelibraryoperator.entities.Book;

public interface BookService {
    public BookResponseDTO getAllBooks();
    public Book saveBook(Book book);
}

package com.unir.msthelibraryoperator.services.impl;

import com.unir.msthelibraryoperator.dtos.BookResponseDTO;
import com.unir.msthelibraryoperator.entities.Book;
import com.unir.msthelibraryoperator.repositories.BookRepository;
import com.unir.msthelibraryoperator.services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public BookResponseDTO getAllBooks() {
        return new BookResponseDTO("books#volumes", bookRepository.count(), bookRepository.findAll().toArray());
    }

    @Override
    public Book saveBook(Book book) {
        return bookRepository.save(book);
    }
}

package com.unir.msthelibraryoperator.controllers;

import com.unir.msthelibraryoperator.dtos.BookResponseDTO;
import com.unir.msthelibraryoperator.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/books")
public class BookController {

    
    private final BookService bookService;

    @Autowired
    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public BookResponseDTO getAllBooks() {
        return bookService.getAllBooks();
    }
    
}

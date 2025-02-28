package com.unir.msthelibraryoperator.controllers;

import com.unir.msthelibraryoperator.dtos.BookResponseDTO;
import com.unir.msthelibraryoperator.dtos.request.BookRequest;
import com.unir.msthelibraryoperator.entities.Book;
import com.unir.msthelibraryoperator.services.BookMapperService;
import com.unir.msthelibraryoperator.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {

    private final BookMapperService bookMapperService;
    private final BookService bookService;

    @Autowired
    public BookController(BookMapperService bookMapperService, BookService bookService) {
        this.bookMapperService = bookMapperService;
        this.bookService = bookService;
    }

    @GetMapping
    public BookResponseDTO getAllBooks() {
        try{
            return bookService.getAllBooks();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

    }


    @PostMapping
    public Book createBook(@RequestBody BookRequest bookRequest) {
        Book book = bookMapperService.mapToEntity(bookRequest);
        return bookService.saveBook(book);
    }
}

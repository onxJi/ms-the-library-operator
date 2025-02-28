package com.unir.msthelibraryoperator.repositories;
import com.unir.msthelibraryoperator.entities.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
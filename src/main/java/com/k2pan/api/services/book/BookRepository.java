package com.k2pan.api.services.book;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.k2pan.api.models.book.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
    
}

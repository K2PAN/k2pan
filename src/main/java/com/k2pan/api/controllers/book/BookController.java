package com.k2pan.api.controllers.book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.k2pan.api.models.book.Book;
import com.k2pan.api.services.book.BookResponse;
import com.k2pan.api.services.book.BookService;

@RestController
@RequestMapping("api/books")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public BookResponse getAllBook() {
        
        return bookService.loadAllBook();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable(value = "id") Long bookId) {
        Book book = bookService.loadBook(bookId);
        return ResponseEntity.ok().body(book);
    }

    @PostMapping
    public Book createBook(@Validated @RequestBody Book book) {
        return bookService.saveBook(book);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable(value = "id") long bookId,@Validated @RequestBody Book bookDetails){
        Book book = bookService.updateBook(bookId, bookDetails);
        return ResponseEntity.ok().body(book);
    }

    @DeleteMapping("/{id}")
    public Map<String, Boolean> deleteBook(@PathVariable(value = "id") Long bookId){
        bookService.deleteBook(bookId);
        Map<String,Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }
}

package com.k2pan.api.services.book;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.k2pan.api.models.book.Book;

@Service
public class BookService {
    @Autowired
    private BookRepository bookRepository;

    public Book createBook(Book book) {
        return bookRepository.save(book);
    }

    public Book loadBook(long id) throws ResourceNotFoundException {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with Bookname: " + id));
        return book;
    }

    public BookResponse loadAllBook() {
        List<Book> books = bookRepository.findAll();
        long count = bookRepository.count();
        return new BookResponse(count, books);
    }

    public Book updateBook(long id, Book bookreq) throws ResourceNotFoundException {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with Bookname: " + id));

        book.setBookname(bookreq.getBookname());
        book.setEmail(bookreq.getEmail());
        book.setUsername(bookreq.getUsername());
        // Book updateBook = Book.builder()
        //     .withBookName(bookreq.getBookname())
        //     .withUsername(bookreq.getUsername())
        //     .withEmail(bookreq.getEmail())
        //     .build();
        return bookRepository.save(book);
    }

    public void deleteBook(long id) throws ResourceNotFoundException {
        Book book = bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book not found with Bookname: " + id));
        bookRepository.delete(book);
    }
}

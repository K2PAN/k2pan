package com.k2pan.api.models.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookinfo")
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String bookname;

    @Column(nullable = false)
    private String username;

    @Column(nullable = false)
    private String email;

    public Book() {
    }

    public String getBookname() {
        return bookname;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public static class Builder {
        private final Book book;

        public Builder() {
            this.book = new Book();
        }

        public Builder withBookName(String bookname) {
            this.book.setBookname(bookname);
            return this;
        }

        public Builder withUsername(String username) {
            this.book.setUsername(username);
            return this;
        }
        public Builder withEmail(String email) {
            this.book.setEmail(email);
            return this;
        }
        public Book build(){
            return this.book;
        }
    }
    public static Builder builder() {
        return new Builder();
    }

}

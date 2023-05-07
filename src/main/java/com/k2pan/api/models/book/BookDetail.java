package com.k2pan.api.models.book;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bookdetail")
public class BookDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String publisher;

    @Column(nullable = false)
    private String publicationdate;

    @Column(nullable = false)
    private String language;

    @Column(nullable = false)
    private String format;

    @Column(nullable = false)
    private int pages;

    @Override
    public String toString() {
        return "Order{" +
                "author=" + author +
                ", title=" + title +
                ", genre=" + genre +
                ", publicationdate=" + publicationdate +
                ", language=" + language +
                ", format=" + format +
                ", pages=" + pages +
                ", description=" + description +
                ", publisher=" + publisher +
                '}';
    }

    private BookDetail() {
    }

    public String getAuthor() {
        return author;
    }

    public Long getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public String getFormat() {
        return format;
    }

    public String getGenre() {
        return genre;
    }

    public String getLanguage() {
        return language;
    }

    public int getPages() {
        return pages;
    }

    public String getPublicationdate() {
        return publicationdate;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getTitle() {
        return title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setPublicationdate(String publicationdate) {
        this.publicationdate = publicationdate;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static class Builder {

        private final BookDetail bookDetail;

        private Builder() {
            this.bookDetail = new BookDetail();
        }

        public Builder setAuthor(String author) {
            this.bookDetail.setAuthor(author);
            return this;
        }

        public Builder setTitle(String title) {
            this.bookDetail.setTitle(title);
            return this;
        }

        public Builder setGenre(String genre) {
            this.bookDetail.setGenre(genre);
            return this;
        }

        public Builder setDescription(String description) {
            this.bookDetail.setDescription(description);
            return this;
        }

        public Builder setPublisher(String publisher) {
            this.bookDetail.setPublisher(publisher);
            return this;
        }

        public Builder setPublicationdate(String publicationdate) {
            this.bookDetail.setPublicationdate(publicationdate);
            return this;
        }

        public Builder setLanguage(String language) {
            this.bookDetail.setLanguage(language);
            return this;
        }

        public Builder setPages(int pages) {
            this.bookDetail.setPages(pages);
            return this;
        }

        public Builder setFormat(String format) {
            this.bookDetail.setFormat(format);
            return this;
        }

        public BookDetail build() {
            return this.bookDetail;

        }
    }

    public static Builder builder() {
        return new Builder();
    }

}

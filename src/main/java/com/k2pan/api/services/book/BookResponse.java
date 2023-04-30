package com.k2pan.api.services.book;

import java.util.List;

import com.k2pan.api.models.book.Book;

public class BookResponse {
    private long count;
    private List<Book> data;

    public BookResponse(long count, List<Book> data) {
        this.count = count;
        this.data = data;
    }

    public long getCount() {
        return count;
    }

    public void setCount(long count) {
        this.count = count;
    }

    public List<Book> getData() {
        return data;
    }

    public void setData(List<Book> data) {
        this.data = data;
    }
    

}

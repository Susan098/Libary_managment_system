package com.example.libary.dao;

import com.example.libary.model.Book;
import java.util.ArrayList;
import java.util.List;

public class BookDao {
    private final List<Book> books = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> getAllBooks() {
        return books;
    }
}

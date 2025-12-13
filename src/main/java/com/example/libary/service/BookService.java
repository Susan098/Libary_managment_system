package com.example.libary.service;

import com.example.libary.dao.BookDao;
import com.example.libary.model.Book;

public class BookService {
    private final BookDao bookDao = new BookDao();
    private int bookId = 1;

    public void addBook(String title, String author) {
        bookDao.addBook(new Book(bookId++, title, author));
    }

    public void showBooks() {
        if (bookDao.getAllBooks().isEmpty()) {
            System.out.println("No books available.");
            return;
        }

        for (Book book : bookDao.getAllBooks()) {
            System.out.println(book);
        }
    }
}


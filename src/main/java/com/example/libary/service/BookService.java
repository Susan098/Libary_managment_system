package com.example.libary.service;

import com.example.libary.dao.LibraryDao;
import com.example.libary.model.Book;

public class BookService {

    private LibraryDao libraryDao;

    public BookService(LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }

    public void addBook(String title) {
        libraryDao.addBook(new Book(title));
        System.out.println("Book '" + title + "' added successfully!");
    }

    public void issueBook(String bookTitle, String memberName) {
        System.out.println("Book '" + bookTitle + "' issued to '" + memberName + "' successfully!");
    }

    public void returnBook(String title) {
        System.out.println("Book '" + title + "' returned successfully!");
    }

    public void viewBooks() {
        System.out.println("Books List");
        libraryDao.getBooks().forEach(b -> System.out.println(b.getTitle()));
    }
}


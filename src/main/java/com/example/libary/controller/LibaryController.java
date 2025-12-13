package com.example.libary.controller;

import com.example.libary.service.BookService;
import com.example.libary.utils.InputUtils;

public class LibraryController {
    private final BookService bookService = new BookService();

    public void menu() {
        while (true) {
            System.out.println("\n--- Library Menu ---");
            System.out.println("1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Logout");

            int choice = InputUtils.readInt("Choose option: ");

            switch (choice) {
                case 1 -> {
                    String title = InputUtils.readString("Book title: ");
                    String author = InputUtils.readString("Author: ");
                    bookService.addBook(title, author);
                }
                case 2 -> bookService.showBooks();
                case 3 -> {
                    System.out.println("Logged out!");
                    return;
                }
                default -> System.out.println("Invalid choice!");
            }
        }
    }
}

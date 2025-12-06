package com.example.libary.controller;

import com.example.libary.service.BookService;
import com.example.libary.service.MemberService;
import com.example.libary.utils.InputUtils;

public class LibraryController {

    private BookService bookService;
    private MemberService memberService;

    public LibraryController(BookService bookService, MemberService memberService) {
        this.bookService = bookService;
        this.memberService = memberService;
    }

    public void handleChoice(int choice) {
        switch (choice) {
            case 1:
                String bookTitle = InputUtils.getString("Enter book title: ");
                bookService.addBook(bookTitle);
                break;

            case 2:
                String name = InputUtils.getString("Enter member name: ");
                memberService.registerMember(name);
                break;

            case 3:
                String issueBook = InputUtils.getString("Enter book title to issue: ");
                String member = InputUtils.getString("Enter member name: ");
                bookService.issueBook(issueBook, member);
                break;

            case 4:
                String returnBook = InputUtils.getString("Enter book title to return: ");
                bookService.returnBook(returnBook);
                break;

            case 5:
                bookService.viewBooks();
                break;

            case 6:
                memberService.viewMembers();
                break;

            case 7:
                System.out.println("Exiting system. Goodbye!");
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }
}

package com.example.libary.dao;

import java.util.ArrayList;
import java.util.List;
import com.example.libary.model.Book;
import com.example.libary.model.Member;

public class LibraryDao {
    private List<Book> books = new ArrayList<>();
    private List<Member> members = new ArrayList<>();

    public void addBook(Book book) {
        books.add(book);
    }

    public void addMember(Member member) {
        members.add(member);
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Member> getMembers() {
        return members;
    }
}

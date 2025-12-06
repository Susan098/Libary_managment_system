package com.example.libary.service;

import com.example.libary.dao.LibraryDao;
import com.example.libary.model.Member;

public class MemberService {

    private LibraryDao libraryDao;

    public MemberService(LibraryDao libraryDao) {
        this.libraryDao = libraryDao;
    }

    public void registerMember(String name) {
        libraryDao.addMember(new Member(name));
        System.out.println("Member '" + name + "' registered successfully!");
    }

    public void viewMembers() {
        System.out.println("Members List");
        libraryDao.getMembers().forEach(m -> System.out.println(m.getName()));
    }
}

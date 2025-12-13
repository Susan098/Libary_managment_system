package com.example.libary.controller;

import com.example.libary.service.MemberService;
import com.example.libary.utils.InputUtils;

public class Login {
    private final MemberService memberService = new MemberService();

    public void login() {
        String username = InputUtils.readString("Username: ");
        String password = InputUtils.readString("Password: ");

        if (memberService.login(username, password)) {
            System.out.println("Login successful!");
            new LibraryController().menu();
        } else {
            System.out.println("Invalid credentials!");
        }
    }
}

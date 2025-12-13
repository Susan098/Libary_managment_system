package com.example.libary.controller;

import com.example.libary.service.MemberService;
import com.example.libary.utils.InputUtils;

public class Register {
    private final MemberService memberService = new MemberService();

    public void register() {
        String username = InputUtils.readString("Username: ");
        String password = InputUtils.readString("Password: ");
        memberService.register(username, password);
    }
}

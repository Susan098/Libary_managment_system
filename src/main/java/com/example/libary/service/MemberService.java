package com.example.libary.service;

import com.example.libary.dao.MemberDao;
import com.example.libary.model.Member;

public class MemberService {
    private final MemberDao memberDao = new MemberDao();

    public void register(String username, String password) {
        memberDao.addMember(new Member(username, password));
        System.out.println("Registration successful!");
    }

    public boolean login(String username, String password) {
        Member member = memberDao.findByUsername(username);
        return member != null && member.getPassword().equals(password);
    }
}

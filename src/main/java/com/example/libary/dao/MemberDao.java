package com.example.libary.dao;

import com.example.libary.model.Member;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
    private final List<Member> members = new ArrayList<>();

    public void addMember(Member member) {
        members.add(member);
    }

    public Member findByUsername(String username) {
        for (Member m : members) {
            if (m.getUsername().equals(username)) {
                return m;
            }
        }
        return null;
    }
}

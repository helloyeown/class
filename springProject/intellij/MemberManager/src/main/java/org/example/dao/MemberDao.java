package org.example.dao;

import org.example.domain.Member;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MemberDao implements Dao {

    // Map<key, value> : key-email, value-Member Obj
    private Map<String, Member> map = new HashMap<>();

    // id: Member의 long id
    private long nextId = 0;    // insert(입력 시) nextId++

    @Override
    public void insert(Member member) {
        member.setId(++nextId);
        map.put(member.getEmail(), member);
    }

    @Override
    public void update(Member member) {
        map.put(member.getEmail(), member);
    }

    @Override
    public Member selectByEmail(String email) {
        return map.get(email);
    }

    public Collection<Member> selectAll(){
        return map.values();
    }

}

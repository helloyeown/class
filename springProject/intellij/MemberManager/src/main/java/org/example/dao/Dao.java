package org.example.dao;

import org.example.domain.Member;

public interface Dao {

    void insert(Member member);

    void update(Member member);
    // pw 변경

    Member selectByEmail(String email);

}

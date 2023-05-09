package org.example.service;

import org.example.dao.Dao;
import org.example.domain.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class ChangePasswordService {

    @Autowired
    @Qualifier("member")
    private Dao dao;

//    public ChangePasswordService(Dao dao) {
//        this.dao = dao;
//    }

    // 이메일, 현재비번, 새비번 -> 데이터 변경
    public void changePassword(String email, String oldPW, String newPW){
        // 1. 이메일로 저장된 회원정보 있는지 판단 -> selectByEmail()
        Member member = dao.selectByEmail(email);

        if(member==null){
            // 존재하지 않는 회원
            System.out.println("존재하지 않는 회원 정보입니다.");
            return;
        }

        // 비밀번호 변경 처리
        member.changePassword(oldPW, newPW);

        dao.update(member);

    }

}

package com.app.board.service.member;

import com.app.board.domain.member.MemberDTO;
import com.app.board.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class MemberSelectService {

    @Autowired
    private MemberMapper mapper;

    public boolean selectMember(String uid, String pw, HttpSession session){
        MemberDTO member = mapper.selectByUidPw(uid, pw);

        if(member!=null){
            session.setAttribute("loginInfo", member);
            return true;
        }

    return false;

    }

}

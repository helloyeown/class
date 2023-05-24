package com.hi.app.service.member;

import com.hi.app.domain.member.MemberDTO;
import com.hi.app.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class MemberLoginService {

    @Autowired
    private MemberMapper mapper;

    public boolean login(String uid, String pw, HttpSession session){

        MemberDTO member = mapper.login(uid, pw);

        if(member!=null){
            session.setAttribute("loginInfo", member);
            return true;
        }
        return false;

    }

}

package com.hi.app.service.member;

import com.hi.app.domain.member.MemberRegRequest;
import com.hi.app.mapper.MemberMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberRegService {

    @Autowired
    private MemberMapper mapper;

    public int memberReg(MemberRegRequest member){
        return mapper.memberReg(member);
    }

}

package com.hi.app.mapper;

import com.hi.app.domain.member.MemberDTO;
import com.hi.app.domain.member.MemberRegRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MemberMapper {

    public int memberReg(MemberRegRequest member);

    public MemberDTO login(String uid, String pw);

}

package com.hi.board.mapper;

import com.hi.board.domain.member.MemberDTO;
import com.hi.board.domain.member.MemberRegistRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    MemberDTO selectByUidPw(String uid, String pw);

    // insert
    int insertMember(MemberRegistRequest registRequest);

}

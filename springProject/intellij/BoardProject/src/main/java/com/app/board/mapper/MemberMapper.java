package com.app.board.mapper;

import com.app.board.domain.member.MemberDTO;
import com.app.board.domain.member.MemberRegRequest;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    MemberDTO selectByUidPw(String uid, String pw);

    int registMember(MemberRegRequest memberRegRequest);

}

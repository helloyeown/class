package com.hi.board.mapper;

import com.hi.board.domain.member.MemberDTO;
import com.hi.board.domain.member.MemberRegistRequest;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface MemberMapper {

    MemberDTO selectByUidPw(String uid, String pw);

    // 회원 존재 여부 확인
    @Select("select count(*) from member where uid=#{uid}") // xml대신 어노테이션으로 처리
    int selectCountByUid(String uid);

    // insert
    int insertMember(MemberRegistRequest registRequest);

}

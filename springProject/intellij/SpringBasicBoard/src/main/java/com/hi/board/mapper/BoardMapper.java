package com.hi.board.mapper;

import com.hi.board.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    // List<BoardDTO> selectList(int startNum, int count); // selectList(0, 5) -> #{param1} => 0, #{param2} => 5

    List<BoardDTO> selectList(PageOption pageOption);

    int selectTotalCount(BoardSearchOption searchOption);


    List<BoardDTO> selectAll();

    BoardDTO selectByBno(int bno);


    int insertBoard(RequestRegBoard regBoard);

    int updateBoard(RequestModifyBoard modifyRequest);

    int deleteBoard(int bno);

}
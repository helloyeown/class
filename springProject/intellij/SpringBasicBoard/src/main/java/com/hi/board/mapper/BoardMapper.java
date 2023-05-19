package com.hi.board.mapper;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestModifyBoard;
import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {


    List<BoardDTO> selectList(int startNum, int count);
    //select(0,5)   #{param1}->0, #{param2}->5


    int selectTotalCount();


//    @Select("Select * from tbl_board")
    List<BoardDTO> selectAll();


    BoardDTO selectByBno(int bno);


    int insertBoard(RequestRegBoard regBoard);


    int updateBoard(RequestModifyBoard modifyBoard);


    int deleteBoard(int bno);

}

package com.hi.board.mapper;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestRegBoard;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface BoardMapper {

//    @Select("Select * from tbl_board")
    List<BoardDTO> selectAll();

    int insertBoard(RequestRegBoard regBoard);

}

package com.app.board.mapper;

import com.app.board.domain.BoardDTO;
import com.app.board.domain.BoardRegRequest;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface BoardMapper {

    List<BoardDTO> selectAll();

    BoardDTO selectByBno(int bno);

    int insertBoard(BoardRegRequest boardRegRequest);

}

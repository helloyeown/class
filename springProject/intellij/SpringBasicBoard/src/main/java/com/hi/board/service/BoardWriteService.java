package com.hi.board.service;

import com.hi.board.domain.RequestRegBoard;
import com.hi.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardWriteService {

    @Autowired
    private BoardMapper boardMapper;

    public int writeBoard(RequestRegBoard board){
        return boardMapper.insertBoard(board);
    }


}

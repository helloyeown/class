package com.hi.board.service;

import com.hi.board.domain.BoardDTO;
import com.hi.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardReadService {

    @Autowired
    private BoardMapper mapper;

    public BoardDTO getBoardDTO(int bno){
        return mapper.selectByBno(bno);
    }

}

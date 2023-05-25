package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.mapper.BoardMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BoardReadService {

    @Autowired
    private BoardMapper mapper;

    public BoardDTO selectByBno(int bno){
        return mapper.selectByBno(bno);
    }

}

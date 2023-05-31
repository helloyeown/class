package com.app.board.service;

import com.app.board.domain.BoardDTO;
import com.app.board.mapper.BoardMapper;
import lombok.extern.java.Log;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j2
public class BoardReadService {

    @Autowired
    private BoardMapper mapper;

    public BoardDTO selectByBno(int bno){

        BoardDTO board = mapper.selectByBno(bno);
        log.info(board);

        return board;
    }

}

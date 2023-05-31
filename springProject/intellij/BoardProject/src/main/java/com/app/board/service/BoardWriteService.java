package com.app.board.service;

import com.app.board.domain.BoardRegRequest;
import com.app.board.mapper.BoardMapper;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Service
public class BoardWriteService {

    @Autowired
    private BoardMapper mapper;

    public int boardWrite(BoardRegRequest boardRegRequest, HttpServletRequest request){

        if(boardRegRequest.getFile()!=null && boardRegRequest.getFile().getSize()>0){

            String uri = "/uploadfile/board";
            String realPath = request.getSession().getServletContext().getRealPath(uri);
            String newFilename = UUID.randomUUID().toString() + boardRegRequest.getFile().getOriginalFilename();
            File file = new File(realPath, newFilename);

            try {
                boardRegRequest.getFile().transferTo(file);
                boardRegRequest.setFilename(newFilename);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

        return mapper.insertBoard(boardRegRequest);

    }

}

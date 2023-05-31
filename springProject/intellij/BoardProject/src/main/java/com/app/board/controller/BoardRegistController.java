package com.app.board.controller;

import com.app.board.domain.BoardRegRequest;
import com.app.board.service.BoardWriteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/board/regist")
public class BoardRegistController {

    @Autowired
    private BoardWriteService writeService;

    @GetMapping
    public String getRegistForm(){

        log.info("get    /board/regist");

        return "board/regist";
    }

    @PostMapping
    public String writeBoard(BoardRegRequest boardRegRequest, HttpServletRequest request){

        log.info("post    /board/regist");
        writeService.boardWrite(boardRegRequest, request);

        return "redirect:/board/list";
    }

}

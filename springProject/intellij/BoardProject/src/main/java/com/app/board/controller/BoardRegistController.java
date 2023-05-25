package com.app.board.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/board/regist")
public class BoardRegistController {

    @GetMapping
    public String getRegistForm(){

        log.info("get    /board/regist");

        return "board/regist";
    }

}

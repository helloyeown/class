package com.app.board.controller;

import com.app.board.service.BoardReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/board/read")
@Log4j2
public class BoardReadController {

    @Autowired
    BoardReadService readService;

    @GetMapping
    public String getRead(@RequestParam("bno") int bno,
                          Model model){

        log.info("get    /board/read");
        model.addAttribute("board", readService.selectByBno(bno));

        return "board/read";
    }

}

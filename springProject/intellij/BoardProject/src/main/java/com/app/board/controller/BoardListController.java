package com.app.board.controller;

import com.app.board.domain.BoardDTO;
import com.app.board.service.BoardListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@Log4j2
@RequestMapping("/board/list")
public class BoardListController {

    @Autowired
    BoardListService listService;

    @GetMapping
    public void getList(Model model){
        log.info("get    /board/list");

        List<BoardDTO> list = listService.selectAll();
        model.addAttribute("list", list);
        log.info(list);
    }

}

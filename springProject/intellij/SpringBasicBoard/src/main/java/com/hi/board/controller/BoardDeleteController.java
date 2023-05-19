package com.hi.board.controller;

import com.hi.board.service.BoardDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
public class BoardDeleteController {

    @Autowired
    private BoardDeleteService deleteService;

    @RequestMapping("/board/delete")
    public String delete(@RequestParam("bno") int bno,
                         HttpServletRequest request){

        log.info("/board/delete: " + bno);
        deleteService.deleteBoard(bno, request);

        return "redirect:/board/list";
    }

}

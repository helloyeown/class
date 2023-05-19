package com.hi.board.controller;

import com.hi.board.domain.BoardDTO;
import com.hi.board.domain.RequestModifyBoard;
import com.hi.board.service.BoardModifyService;
import com.hi.board.service.BoardReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/board/modify")
public class BoardModifyController {


    @Autowired
    private BoardReadService readService;
    @Autowired
    private BoardModifyService modifyService;


    @GetMapping
    public void modifyForm(@RequestParam("bno") int bno,
                           Model model){

        // bno 전달 받고 view로 BoardDTO 객체 전달
        model.addAttribute("board", readService.getBoardDTO(bno));
    }


    @PostMapping
    public String modify(RequestModifyBoard requestModifyBoard,
                         HttpServletRequest request){

        log.info(requestModifyBoard);

        modifyService.modifyBoardDTO(requestModifyBoard, request);

        // 사용자가 입력한 BoardDTO를 Service로 전달 -> update 요청
        return "redirect:/board/list";
    }

}

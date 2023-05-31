package com.app.board.controller.member;

import com.app.board.domain.member.MemberRegRequest;
import com.app.board.service.member.MemberRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/regist")
public class MemberRegController {

    @Autowired
    private MemberRegService memberRegService;

    @GetMapping
    public String getRegistForm(){
        return "member/regist";
    }

    @PostMapping
    public String memberRegist(MemberRegRequest member, HttpServletRequest request){
        log.info("post    /regist");
        memberRegService.memberRegist(member, request);

        return "redirect:/login";
    }

}

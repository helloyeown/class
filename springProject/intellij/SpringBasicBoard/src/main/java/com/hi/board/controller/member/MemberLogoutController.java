package com.hi.board.controller.member;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@Log4j2
public class MemberLogoutController {

    @RequestMapping("/logout")
    public String logout(HttpSession session){

        log.info("/logout...");
        session.invalidate();   // 세션 소멸

        return "redirect:/login";
    }

}

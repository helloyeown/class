package com.hi.app.controller.member;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@Log4j2
public class MemberLogoutController {

    @RequestMapping("/logout")
    public String logout(HttpSession session){
        log.info("로그아웃...");
        session.invalidate();

        return "redirect:/login";
    }

}

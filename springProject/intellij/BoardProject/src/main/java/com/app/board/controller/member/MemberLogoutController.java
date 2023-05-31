package com.app.board.controller.member;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/logout")
public class MemberLogoutController {

    @GetMapping
    public String logout(HttpSession session){
        session.invalidate();
        return  "redirect:/login";
    }

}

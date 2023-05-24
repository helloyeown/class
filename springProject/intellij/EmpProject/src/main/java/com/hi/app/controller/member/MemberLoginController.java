package com.hi.app.controller.member;

import com.hi.app.service.member.MemberLoginService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;

@Controller
@Log4j2
@RequestMapping("/login")
public class MemberLoginController {

    @Autowired
    private MemberLoginService loginService;

    @GetMapping
    public String getLoginForm(){
        return "/member/loginForm";
    }

    @PostMapping
    public String login(@RequestParam("uid") String uid,
                        @RequestParam("pw") String pw,
                        HttpSession session,
                        Model model){



        boolean result = loginService.login(uid, pw, session);

        if(result){
            return "redirect:/emp/list";
        }

        return  "redirect:/login";

    }

}

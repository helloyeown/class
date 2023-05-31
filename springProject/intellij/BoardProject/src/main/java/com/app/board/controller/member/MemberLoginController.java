package com.app.board.controller.member;

import com.app.board.domain.member.MemberDTO;
import com.app.board.service.member.MemberSelectService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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
    private MemberSelectService selectService;

    @GetMapping
    public String getLoginForm(){
        log.info("get    /login");

        return "member/loginForm";
    }

    @PostMapping
    public String login(@RequestParam("uid") String uid,
                        @RequestParam("pw") String pw,
                        HttpSession session){

        boolean result = selectService.selectMember(uid, pw, session);

        if(result){
            return "redirect:/board/list";
        }

        return "redirect:/login";
    }

}

package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class PathVarController {

    @RequestMapping("/members/{type}/{idx}")   // http://localhost:8080/members/user/10 idx 변수 설정
    public String getMemberInfo(@PathVariable("idx") String idx,
                                @PathVariable("type") String type,
                                Model model){

        log.info("type = " + type);
        log.info("idx = " + idx);

        model.addAttribute("idx", idx);
        model.addAttribute("type", type);

        return "member/info";
    }

}

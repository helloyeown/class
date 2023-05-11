package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/todo/regist")
@Log4j2
public class TodoRegistController {

    @RequestMapping(method = RequestMethod.GET)
    // get: form page로 응답
    public String getRegistForm(){

        log.info("GET /todo/regist");

        return "todo/registForm";   // resolver 이용
        // /WEB-INF/views/ todo/regist .jsp
    }

    @RequestMapping(method = RequestMethod.POST)
    // post: redirect -> /todo/list, view 필요 없음
    public String regist(){

        log.info("post /todo/regist");

        return "redirect:/todo/list";
        // 일반 view와 구분은 'redirect:' 문자열로 구분
        // http://localhost:8080/todo/list 로 보냄
    }

}
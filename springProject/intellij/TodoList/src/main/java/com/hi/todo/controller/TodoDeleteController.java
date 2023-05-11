package com.hi.todo.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class TodoDeleteController {

    // 삭제 번호를 받고 삭제 처리 -> /todo/list redirect
    @RequestMapping("/todo/delete")
    public String deleteTodo(){

        log.info("/todo/delete");
        return "redirect:/todo/list";   // view가 아닌 url

    }

}

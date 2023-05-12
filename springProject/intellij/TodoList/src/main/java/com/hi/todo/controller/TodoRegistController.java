package com.hi.todo.controller;

import com.hi.todo.domain.TodoRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String regist(Model model,
                         String todo,
                         String duedate,
                         @RequestParam(value = "todo", required = false) String requestTodo,
                         @RequestParam(value="duedate", defaultValue = "2023-12-25") String requestDuedate,
                         TodoRequest todoRequest){

        log.info("post /todo/regist");

        log.info("todo: " + todo);
        log.info("duedate: " + duedate);

        log.info("todo: " + requestTodo);
        log.info("duedate: " + requestDuedate);

        // Command 클래스 정의: 파라미터를 받는 변수 선언
        // Controller 메소드의 매개변수로 정의
        log.info("TodoRequest: " + todoRequest);

        model.addAttribute("todo", todo);
        model.addAttribute("duedate", duedate);

        return "todo/regist";
//        return "redirect:/todo/list";
        // 일반 view와 구분은 'redirect:' 문자열로 구분
        // http://localhost:8080/todo/list 로 보냄
    }

}
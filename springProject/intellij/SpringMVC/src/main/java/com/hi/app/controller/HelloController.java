package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@Log4j2
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(){
        // ModelAndView: 응답할 view의 경로, view 공유할 결과 data
        ModelAndView mav = new ModelAndView();
        // view 경로 지정
        mav.setViewName("hello");   // /WEB-INF/views/hello.jsp (resolver)

        // Service에 요청 -> 응답 받은 데이터를 공유
        mav.addObject("greeting", "Hello");
        // view로 전달할 데이터 설정

        return mav;
    }

}

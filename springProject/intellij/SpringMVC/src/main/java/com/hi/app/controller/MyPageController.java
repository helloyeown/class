package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/mypage")
public class MyPageController {

    @GetMapping("/mypage1")
    public void mypage1(){
        log.info("GET   /mypage/mypage1");
    }

    @GetMapping("/mypage2")
    public void mypage2(){
        log.info("GET   /mypage/mypage2");
    }

    @GetMapping("/mypage3")
    public void mypage3(){
        log.info("GET   /mypage/mypage3");
    }

}

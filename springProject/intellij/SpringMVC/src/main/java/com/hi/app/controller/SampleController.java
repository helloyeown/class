package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class SampleController {

    @RequestMapping("/sample/sample1")  // localhost:8080/sample/sample1
    public void getPage1(){

        log.info("/sample/sample1... getPage1()...");
        // void 반환의 경우 -> view의 경로는 url 설정 경로로 처리
        // return "sample/sample1"
        // /WEB-INF/views/sample/sample1.jsp
    }


    @RequestMapping("/sample/sample2")
    public void getPage2(Model model){

        log.info("/sample/sample2... getPage2()...");

        // Model 객체는 view와 공유할 수 있는 데이터를 저장하는 객체
        // 매개변수로 Model 선언해주면 메소드 호출시 현재 Model 객체를 전달
        model.addAttribute("msg", "안녕하세요");

    }


    @RequestMapping("/sample/sample3")
    public String getPage3(Model model){

        model.addAttribute("msg", "반갑습니다");

        return "sample/sample2";
        // /WEB-INF/views/sample/sample2.jsp
    }

}

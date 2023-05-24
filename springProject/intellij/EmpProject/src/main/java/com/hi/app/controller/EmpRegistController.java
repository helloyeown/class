package com.hi.app.controller;

import com.hi.app.domain.RequestRegEmp;
import com.hi.app.mapper.EmpMapper;
import com.hi.app.service.EmpRegistService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/emp/regist")
public class EmpRegistController {

    @Autowired
    private EmpRegistService registService;

    @GetMapping
    public String getRegistForm(){
        log.info("get    /emp/regist");
        return "/emp/regist";
    }

    @PostMapping
    public String registEmp(RequestRegEmp emp,
                            HttpServletRequest request){
        log.info("emp: " + emp);
        log.info("post    /emp/regist");

        registService.regist(emp, request);

        return "redirect:/emp/list";
    }

}

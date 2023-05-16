package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptRegistRequest;
import com.hi.deptspring.deptspring.service.DeptRegistService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/dept/regist")
@Log4j2
public class DeptRegistController {

    @Autowired
    private DeptRegistService registService;

    @GetMapping
    public String registForm(){
        log.info("get    /dept/regist");
        return "dept/registForm";
    }

    @PostMapping
    public String regist(DeptRegistRequest registRequest){

        log.info(registRequest);
        log.info("post    /dept/regist");

        registService.registDept(registRequest);

        return "redirect:/dept/list";
    }

}

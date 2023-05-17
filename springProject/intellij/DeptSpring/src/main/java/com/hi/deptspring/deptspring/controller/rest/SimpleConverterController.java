package com.hi.deptspring.deptspring.controller.rest;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@Log4j2
@RequestMapping("/mc/simple")
public class SimpleConverterController {

    @GetMapping
    public void form(){
        log.info("GET  /mc/simple");
    }

    @PostMapping
    @ResponseBody
    public String simple(@RequestBody String body){
        log.info("body >>> " + body);
        return "body >>>> ";
        // @ResponseBody가 없으면
    }

}
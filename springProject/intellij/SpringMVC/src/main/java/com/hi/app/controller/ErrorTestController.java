package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorTestController {

    @RequestMapping("/errortest")
    public String getError(){

        String str = null;
        str.toString();

        return "index";
    }

}

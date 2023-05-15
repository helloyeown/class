package com.hi.app.controller;

import com.hi.app.domain.UserRequest;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.time.LocalDate;

@Controller
@RequestMapping("/date")
@Log4j2
public class DateConverterController {

    @GetMapping
    public String getDateForm(){
        return "dateForm";
    }

    @PostMapping
    public String date(LocalDate date,
                       UserRequest userRequest){

       log.info("date: " + date);
       log.info("userRequest.getDate(): " + userRequest.getDate());

        return "date";
    }

}

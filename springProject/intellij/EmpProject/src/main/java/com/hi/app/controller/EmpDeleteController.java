package com.hi.app.controller;

import com.hi.app.service.EmpDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
@RequestMapping("/emp/delete")
public class EmpDeleteController {

    @Autowired
    private EmpDeleteService deleteService;

    @GetMapping
    public String delete(@RequestParam("empno") int empno){
        log.info("post    /emp/delete");
        deleteService.deleteEmp(empno);

        return "redirect:/emp/list";
    }


}

package com.hi.app.controller;

import com.hi.app.domain.EmpDTO;
import com.hi.app.service.EmpReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class EmpReadController {

    @Autowired
    private EmpReadService readService;

    @GetMapping("/emp/read")
    public String selectEmp(@RequestParam("empno") int empno,
                            Model model){
        log.info("get    /emp/read");
        readService.readEmp(empno);
        log.info("emp: " + readService.readEmp(empno));

        EmpDTO emp = readService.readEmp(empno);
        model.addAttribute("emp", emp);

        return "read";
    }

}

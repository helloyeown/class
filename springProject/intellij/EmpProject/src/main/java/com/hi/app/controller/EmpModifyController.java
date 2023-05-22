package com.hi.app.controller;

import com.hi.app.domain.EmpDTO;
import com.hi.app.domain.RequestModifyEmp;
import com.hi.app.service.EmpModifyService;
import com.hi.app.service.EmpReadService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;

@Controller
@Log4j2
@RequestMapping("/emp/modify")
public class EmpModifyController {

    @Autowired
    private EmpReadService readService;
    @Autowired
    private EmpModifyService modifyService;

    @GetMapping
    public String getModifyForm(@RequestParam("empno") int empno,
                                Model model){
        log.info("get    /emp/modify");

        EmpDTO emp = readService.readEmp(empno);
        model.addAttribute("emp", emp);

        return "modify";
    }

    @PostMapping
    public String modify(RequestModifyEmp emp, HttpServletRequest request){
        log.info("post    /emp/modify");
        modifyService.modifyEmp(emp, request);

        return "redirect:/emp/list";
    }
}

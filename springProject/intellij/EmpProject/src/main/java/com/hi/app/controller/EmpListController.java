package com.hi.app.controller;

import com.hi.app.service.EmpListService;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log
public class EmpListController {

    @Autowired
    private EmpListService listService;

    @GetMapping("/emp/list")
    public String getList(Model model){
        log.info("get    /emp/list");

        listService.getList();
        log.info("emp: " + listService.getList());

        model.addAttribute("list", listService.getList());

        return "list";
    }

}
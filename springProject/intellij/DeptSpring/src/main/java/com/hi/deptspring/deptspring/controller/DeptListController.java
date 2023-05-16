package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.service.DeptListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
public class DeptListController {


    // @Autowired가 오류 나는 경우가 있어서
    // 변수 final 설정, 생성자를 만듬
    private final DeptListService listService;

    public DeptListController(DeptListService listService) {
        this.listService = listService;
    }


    @RequestMapping("/dept/list")
    public void getListPage(Model model){
        log.info("GET   /dept/list");
        model.addAttribute("list", listService.getList());
    }

}

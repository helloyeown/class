package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.service.DeptDeleteService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class DeptDeleteController {

    @Autowired
    private DeptDeleteService deleteService;

    @RequestMapping("/dept/delete") // get, post 상관 없음
    public String delete(@RequestParam("no") int deptno){

        log.info("/dept/delete");

        deleteService.deleteDept(deptno);
        log.info(deptno + "번 부서 삭제");

        return "redirect:/dept/list";
    }

}

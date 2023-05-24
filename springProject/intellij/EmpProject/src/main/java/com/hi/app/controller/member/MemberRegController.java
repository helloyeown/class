package com.hi.app.controller.member;

import com.hi.app.domain.member.MemberRegRequest;
import com.hi.app.service.EmpListService;
import com.hi.app.service.member.MemberRegService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@Log4j2
@RequestMapping("/login/regist")
public class MemberRegController {

    @Autowired
    private MemberRegService regService;
    @Autowired
    private EmpListService listService;

    @GetMapping
    public String getRegForm(){
        return "/member/regist";
    }

    @PostMapping
    public String memberReg(MemberRegRequest member, Model model){

        log.info("post    /login/regist");

        regService.memberReg(member);
        model.addAttribute("list", listService.getList());

        return "/emp/list";
    }

}

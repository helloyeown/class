package com.hi.board.controller.member;

import com.hi.board.service.member.MemberIdCheckService;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@Log4j2
public class IdCheckController {

    @Autowired
    private MemberIdCheckService checkService;

    @RequestMapping("/member/idcheck")
    @ResponseBody   // view가 아닌 String 반환
    public String idCheck(@RequestParam("uid") String uid){
        return checkService.idCheck(uid);
    }

}

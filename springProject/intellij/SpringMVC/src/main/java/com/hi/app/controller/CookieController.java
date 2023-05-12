package com.hi.app.controller;

import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/cookie")
@Log4j2
public class CookieController {

    @RequestMapping("/make")    // /cookie/make
    public String makeCookie(HttpServletResponse response){

        // 쿠키 생성 -> 응답
        Cookie cookie = new Cookie("userid", "cool");
        // 경로 설정
        cookie.setPath("/");    // localhost의 모든 경로로 요청할 때
        // 소멸 시간
        cookie.setMaxAge(60*60);    // 60초*60분 -> 1시간

        response.addCookie(cookie);

        return "cookie/make";
    }

    // /cookie/view
    @RequestMapping("/view")
    public String viewCookie(@CookieValue("userid") String userId,
                             @CookieValue(value = "auth", defaultValue = "not") String auth,
                             @RequestHeader("Referer") String referer,
                             Model model){

        log.info("Get   /cookie/view");
        log.info("cookie : userid = " + userId);
        log.info("cookie : auth = " + auth);
        log.info("이전 페이지: " + referer);

        model.addAttribute("userid", userId);
        model.addAttribute("auth", auth);

        return "cookie/view";
    }

}

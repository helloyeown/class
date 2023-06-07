package org.zerock.b3.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
@RequestMapping("/sample")
public class HelloController {

    @GetMapping("/hello")
    public void hello(Model model){
        log.info("hello.............");
        model.addAttribute("result", "SUCCESS");
    }

    @GetMapping("/list")
    public void exList(Model model){
        log.info("list.............");
        List<String> strList = List.of("AAA", "BBB", "CCC", "DDD");
        model.addAttribute("strList", strList);
    }

    @GetMapping("/ex2")
    public void ex2(Model model){
        model.addAttribute("keyword", "더 글로리");
    }
    
    @GetMapping("/add")
    public String add(RedirectAttributes rttr){
        rttr.addFlashAttribute("result", "SUCCESS");
        // 한 번만 실행되고 사라짐
        return "redirect:/sample/resultAdd";
    }

    @GetMapping("/resultAdd")
    public void resultAdd(){

    }
}

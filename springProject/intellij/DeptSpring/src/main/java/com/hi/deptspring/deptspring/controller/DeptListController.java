package com.hi.deptspring.deptspring.controller;

import com.hi.deptspring.deptspring.domain.DeptSearchOption;
import com.hi.deptspring.deptspring.service.DeptListService;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@Log4j2
public class DeptListController {


    private final DeptListService listService;

    public DeptListController(DeptListService listService) {
        this.listService = listService;
    }

    @RequestMapping("/dept/list")
    public void getListPage(
            Model model,
            @RequestParam(value = "searchType", defaultValue = "") String searchType,
            @RequestParam(value = "keyword", defaultValue = "") String keyword,
            DeptSearchOption deptSearchOption
    ){
        log.info("GET  /dept/list");

        DeptSearchOption searchOption = DeptSearchOption
                .builder()
                .searchType(keyword.trim().length()<1 ? null : searchType)
                .keyword(keyword.trim().length()<1 ? null : keyword)
                .build();

        log.info(">>>>>  searchOption : "+searchOption);

        deptSearchOption.setKeyword(
                deptSearchOption.getKeyword() != null && deptSearchOption.getKeyword().trim().length()>0 ? deptSearchOption.getKeyword() : null);
        deptSearchOption.setSearchType(deptSearchOption.getKeyword() != null && deptSearchOption.getKeyword().trim().length()>0 ? deptSearchOption.getSearchType() : null);
        log.info(">>>>>  deptSearchOption : " + deptSearchOption);


//        model.addAttribute("list", listService.getList());
        model.addAttribute("list", listService.getSearchList(searchOption));
    }

}
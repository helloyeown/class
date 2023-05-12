package com.hi.app.controller;

import com.hi.app.domain.OrderCommand;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@Log4j2
@RequestMapping("/order/order")
public class OrderController {

    // get: 입력 폼 화면
    @RequestMapping(method = RequestMethod.GET)
    public String getOrderForm(){
        log.info("Get   /order/order");

        return "order/orderForm";
    }


    // post: 데이터를 받아서 화면에 결과 출력

    @RequestMapping(method = RequestMethod.POST)
    public String order(@ModelAttribute("order") OrderCommand orderCommand){

        log.info("Post  /order/order");

        log.info(orderCommand);

        return "order/order";
    }

}

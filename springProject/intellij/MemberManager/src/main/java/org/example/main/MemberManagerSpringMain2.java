package org.example.main;

import org.example.domain.RegisterRequest;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;
import org.springframework.context.support.GenericXmlApplicationContext;

import java.util.Scanner;

public class MemberManagerSpringMain2 {

    static GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtx.xml");

    public static void main(String[] args) {

        // 객체 비교 -> 참조값 비교
        // scope="singleton"
        MemberRegisterService service1 = ctx.getBean("memberRegisterService", MemberRegisterService.class);
        MemberRegisterService service2 = ctx.getBean("memberRegisterService", MemberRegisterService.class);
        System.out.println("service1 == service2 : " +(service1==service2));

    }
}

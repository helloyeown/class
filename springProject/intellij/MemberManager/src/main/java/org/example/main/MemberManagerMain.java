package org.example.main;

import org.example.assembler.Assembler;
import org.example.dao.MemberDao;
import org.example.domain.Member;
import org.example.domain.RegisterRequest;
import org.example.service.ChangePasswordService;
import org.example.service.MemberRegisterService;

import java.util.Scanner;

public class MemberManagerMain {

    static Assembler assembler = new Assembler();   // 조립기: 객체 관리(생성, 주입, 제공)

    public static void main(String[] args) {

        // 사용자 메뉴 입력
        Scanner sc = new Scanner(System.in);

        while(true){

            System.out.println("명령어를 입력해주세요.");
            String command = sc.nextLine();

            // 한줄 단위로 명령어 구분
            if(command.equals("exit")){
                // exit: 프로그램 종료
                System.out.println("프로그램을 종료합니다.");
                return;

            } else if (command.startsWith("new ")) {
                // new 이메일      비번 비번확인 이름
                // new cool@gmail 1111 1111 COOL
                String[] commandStr = command.split(" ");
                // split: 각각의 요소를 지정 단위로 잘라서 배열로 반환

                // 입력 요청
                newCommand(commandStr);

            } else if (command.startsWith("change ")) {
                // change 이메일 oldPW newPW
                String[] commandStr = command.split(" ");

                changeCommand(commandStr);

            }
        }
    }

    // 입력 메소드
    public static void newCommand(String[] args){

        // 전달받은 배열의 사이즈가 5 (new도 포함)
        if (args.length!=5){
            System.out.println("new 명령 구문이 올바르지 않습니다. 다시 시도해주세요.");
            return;
        }

        MemberRegisterService registerService = assembler.getRegisterService();

        // new cool@gmail 1111 1111 COOL
        // [0]   [1]       [3]  [4]  [5]
        RegisterRequest request = new RegisterRequest();
        request.setEmail(args[1]);
        request.setPassword(args[2]);
        request.setConfirmPassword(args[3]);
        request.setName(args[4]);

        // 비밀번호 일치 여부
        if(!request.isConfirmPassword()){
            System.out.println("비밀번호와 확인 비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
            return;
        }

        registerService.regist(request);
        System.out.println();

    }

    // 변경 메소드
    public static void changeCommand(String[] args){

        // change 이메일 oldPW newPW -> 4개

        if (args.length!=4){
            System.out.println("change 명령 구문이 올바르지 않습니다. 다시 시도해주세요.");
            return;
        }

        ChangePasswordService passwordService = assembler.getPasswordService();

        passwordService.changePassword(args[1], args[2], args[3]);

    }

}

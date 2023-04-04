package exam10;

import java.util.Scanner;

public class CheckId {

	public static void main(String[] args) {

		//		콘솔에서 사용자 아이디를 입력 받아 정상적인 영문자와 숫자로만 이루어진 값을 입력했는지 확인

		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요. >>");
		String id = sc.nextLine();

		for(int i=0; i<id.length(); i++) {
			char index = id.charAt(i);

			try {
				if(!(index>='a' && index<='z' || index>='A' && index<='Z' || index>='0' && index<='9')) {
					BadInputException e = new BadInputException("올바른 아이디 형식이 아닙니다.");
					throw e;
				}
			} catch (BadInputException e) {
				System.out.println(e.getMessage());
				return;
			}

		}
	}

}

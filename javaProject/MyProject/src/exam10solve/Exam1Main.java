package exam10solve;

import java.util.Scanner;

public class Exam1Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하세요. >>");
		String id = sc.nextLine();


		// 정상적인 영문자와 숫자로만 이루어진 값인지 확인
		for(int i=0; i<id.length(); i++) {
			char c = id.charAt(i);
			// 영문자, 숫자
			if(!(c>='A'&&c<='Z'||c>='a'&&c<='z'||c>=0&&c<=9)) {
				// 사용자 정의 예외 클래스 발생시키기
				try {
//					throw new Exception();
					throw new BadIdInputException(id);
				} catch(Exception e) {
					System.out.println("영문자와 숫자만 입력 가능합니다.");
					System.out.println(e.getMessage());
					e.printStackTrace();
					break;
					// or return;
					// log 파일에 오류에 대한 내용을 쓰겠다
					// 오류 내용을 DB에 저장하겠다
					// 응답 및 결과는 프로그램 종료 후 재시작하도록 하겠다
				}
			}
		}
	}
}

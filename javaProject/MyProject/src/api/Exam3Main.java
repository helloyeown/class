package api;

import java.util.Scanner;

public class Exam3Main {

	public static void main(String[] args) {
		
		// 사용자에게 이름을 입력 받아
		// 입력 받은 문자열을 정상적인 문자열(영문자)의 이름으로 표현하는지 판별
		// 공백으로 입력되었는지도 판별 -> String trim() -> isEmpty()
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요. >>");
		String name = sc.nextLine();
		
		if(name.trim().isEmpty()) {
			System.out.println("공백 입력은 허용하지 않습니다.");
		} else {
			if(checkName(name)) {
				System.out.println(name);
			} else {
				System.out.println("영문자만 입력 가능합니다.");
			}
		}
		
	}
	
	// 전달 받은 문자열이 영문자로 되어있는지 판별 : a~z, A~Z 0~9
	static boolean checkName(String name) {
		
		boolean result = true;
		
		// 전달받은 문자열 중에 영문자가 아닌 문자를 포함하면 false
		for(int i=0; i<name.length(); i++) {
			char c = name.charAt(i);
			if(!(c>='a' && c<='z' || c>='A' && c<='Z')) {
				result = false;
				break;
			}
		}
		
		return result;
		
	}
}

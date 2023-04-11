package studyExam;

import java.util.Scanner;

public class Exam13 {

	public static void main(String[] args) {
		
//		키보드에서 아무 값이나 무작위로 문장을 입력받는다.
//		입력받은 문자열에 소문자 a가 몇 개 있는지를 판별하는 로직을 구현해보자.
//
//		결과 : 
//		입력 : asdfasdf
//		a의 갯수 : 2

		int cnt = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("영문자를 입력하세요. >>");
		String letter = sc.nextLine();
		
		
		for(int i=0; i<letter.length(); i++) {
			char ch = letter.charAt(i);
			if(ch=='a') {
				cnt++;
			}
		}
		
		System.out.println("a의 갯수: " + cnt);
		
	}
}

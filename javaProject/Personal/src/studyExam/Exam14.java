package studyExam;

import java.util.Scanner;

public class Exam14 {

	private static char ch1;

	public static void main(String[] args) {

		//		회문수 구하기.
		//		회문수란 앞으로 읽어도 뒤로 읽어도 똑같이 읽히는 숫자를 말합니다. 
		//		예를들어 12121과 같은 숫자.
		//		키보드에서 아무값이나 입력받은 후 해당 값이 회문수인지 아닌지를 판단하는 로직(코드)을 구현하자.
		//
		//		결과 :
		//		입력 : 123
		//		123은(는) 회문수가 아닙니다.
		//
		//		or
		//
		//		입력 : a12321a
		//		a12321a은(는) 회문수 입니다.

		Scanner sc = new Scanner(System.in);

		System.out.println("입력하세요. >>");
		String str = sc.nextLine();

		char ch1 = 0;
		char ch2 = 0;

		for(int i=0; i<str.length(); i++) {
			ch1 = str.charAt(i);
			for(int j=str.length()-1; j>=0; j--) {
				ch2 = str.charAt(j);
				if(ch1==ch2) {
					
				} else {
					
				}
			}
		}
		System.out.println("회문수입니다.");
		System.out.println("회문수가 아닙니다.");







	}
}


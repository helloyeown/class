package contact;

import java.util.Scanner;

public class ContactMain2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.>>");
		String strAge = in.nextLine();
		
		int age = Integer.parseInt(strAge);
		// String 타입의 숫자를 int로 변환
		
		System.out.println(strAge);
		
		if(age>19) {
			System.out.println("성인");
		} else {
			System.out.println("미성년");
		}
	}

}

package chapter10;

import java.util.Scanner;

public class ThrowExceptionTest {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("점수를 입력하세요. >>");
		int score = sc.nextInt();

		try {
			if(!(score>=0 && score<=100)) {		// !(0~100)
//				Exception e = new Exception("0~100만 입력 가능합니다.");
				BadInputException e = new BadInputException("잘못된 점수 입력");
				throw e;
			}
		
		} catch(BadInputException e) {
			System.out.println(e.getMessage());
			
		} catch(Exception e) {
			System.out.println(e.getMessage());
			// 0~100만 입력 가능합니다.
		}
	}
}

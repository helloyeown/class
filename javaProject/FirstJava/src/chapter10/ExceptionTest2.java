package chapter10;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionTest2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("프로그램을 시작합니다.");
		System.out.println("정수 하나를 입력하세요. >>");
		
		int num1 = 0;
		int num2 = 0;

		try {
			//예외 발생이 예상되는 코드
			num1 = sc.nextInt();	// 예외 발생 가능
			
			System.out.println("두 번째 정수를 입력하세요. >>");
			
			num2 = sc.nextInt();	// 예외 발생 가능
			
			System.out.println(num1/num2);	// 예외 발생 가능
			System.out.println("연산이 성공적으로 실행됐습니다.");
			
		} catch(ArithmeticException e) {
			// 예외 타입에 따라 예외처리
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(e.getMessage());	// / by zero
			e.printStackTrace();	// 오류메시지 출력
			
		} catch(InputMismatchException e) {
			System.out.println("숫자만 입력하세요.");
			
		} catch(Exception e) {	// Exception은 마지막
			System.out.println("예외가 발생했습니다.");
			System.out.println(e.getMessage());
	
		} finally {
			// try 블럭에 진입하면 무조건 실행
			System.out.println("무조건 실행되는 구문");
		}
	
		
		System.out.println("프로그램을 종료합니다.");

	}
}
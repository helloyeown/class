package chapter03;

public class Operator05 {

	public static void main(String[] args) {
		
		int num1 = 30;
		System.out.println(num1++);			// 30 출력, num1=31
		System.out.println(++num1); 		// 32 출력, num1=32
		System.out.println(num1--); 		// 32 출력, num1=31
		System.out.println(--num1); 		// 30 출력, num1=30
		System.out.println(num1++ + ++num1); 	//30 + ((30+1)+1) = 62 출력
		
	}
}

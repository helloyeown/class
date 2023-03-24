package cal;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {

//		int num=10;
		
//		System.out.println(add(20,10));
//		System.out.println(sub(20,10));
//		System.out.println(mul(10,5));
//		System.out.println(div(10f,3f));
//		System.out.println(div(num,3));		//int->float 자동형변환
		
		add(10,20);
		
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫 번째 숫자를 입력하세요.>>");
		long num1 = in.nextLong();
	
		System.out.println("두 번째 숫자를 입력하세요.>>");
		long num2 = in.nextLong();
	
		System.out.println("연산 결과==========");
		add(num1, num2);
		sub(num1, num2);
		mul(num1, num2);
		div(num1, num2);
		
		
		System.out.println();
		
		
		System.out.println("반지름 값을 입력하세요.>>");
		double r = in.nextDouble();
		
		System.out.println("원의 둘레: " + cal1(r));
		System.out.println("원의 넓이: " + cal2(r));
		
	}		
	
	
	

	//	반환타입, 메소드 이름, 매개변수, 반환이 있다면 return 반환값

	static void add(long a, long b){

		//		long result = num1 + num2;
		//		return result;

		System.out.println(a+ "+" + b + "= " + (a+b));
	}

	static void sub(long a, long b){
		System.out.println(a+ "-" + b + "= " + (a-b));
	}

	static void mul(long a, long b){
		System.out.println(a+ "*" + b + "= " + a*b);
	}

	static void div(float a, float b){
		System.out.println(a+ "/" + b + "= " + (a/b));
	}
	
	
//	실수 반지름 하나를 매개변수의 인자로 전달받아 원의 둘레를 구해 반환하는 메소드를 반환하는 메소드
	static double cal1(double r) {
//		원의 둘레 : 2 x π x r(반지름)
		return 2*Math.PI*r;
	}
	
	
	
//	원의 넓이	
	static double cal2(double r) {
//		원의 넓이 : π x r x r
		return Math.PI * r * r;
	}


}

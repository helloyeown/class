package first;

public class Calculator {

	public static void main(String[] args) {

		int num=10;
		
		System.out.println(add(20,10));
		System.out.println(sub(20,10));
		System.out.println(mul(10,5));
		System.out.println(div(10f,3f));
		System.out.println(div(num,3));		//int->float 자동형변환
		

	}		

	//	반환타입, 메소드 이름, 매개변수, 반환이 있다면 return 반환값

	static long add(long a, long b){

		//		long result = num1 + num2;
		//		return result;

		return a+b;
	}

	static long sub(long a, long b){
		return a-b;
	}

	static long mul(long a, long b){
		return a*b;
	}

	static float div(float a, float b){
		return a/b;
	}


}

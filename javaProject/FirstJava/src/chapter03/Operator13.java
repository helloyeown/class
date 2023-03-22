package chapter03;

public class Operator13 {

	public static void main(String[] args) {
		
		int num1 = 0;
		int num2 = 0;
		
		boolean result = false;
		
		result = (num1 += 10)<0 && (num2 += 10)>0;	//앞부분이 이미 false여서 뒤는 실행 안 됨
		
		System.out.println(result);
		System.out.println("num1= " + num1 + ", num2= " +num2);	//10, 0
		
		result = (num1 += 10)>0 || (num2 += 10)>0;	//앞부분이 이미 true
		System.out.println(result);
		System.out.println("num1= " + num1 + ", num2= " +num2);	//20, 0
		
		
	}
}

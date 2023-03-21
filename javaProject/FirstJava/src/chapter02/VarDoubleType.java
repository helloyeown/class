package chapter02;

public class VarDoubleType {

	public static void main(String[] args) {

		// 실수 저장할 수 있는 타입: float, double
		float num1 = 1.23456789f;	//타입 일치, 표현 범위를 넘어서 뒤가 잘림(오차 발생)
		System.out.println(num1);	//1.2345679
		
		double num2 = 1.23456789123456789;	//
		System.out.println(num2);			//1.234567891234568
		
		float height1 = 180.5f;
		System.out.println(height1);
		
		double height2 = 180.5;
		System.out.println(height2);
		
	}	

}

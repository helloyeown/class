package chapter02;

public class Casting2 {

	public static void main(String[] args) {

		byte b = 10;
		int i = (int)b;		//(int) 생략 가능
		
		System.out.println("i= " + i);
		System.out.println("b= " + b);
		
		int i2 = 300;
		byte b2 = (byte)i2;		//byte가 범위를 넘어 왜곡 생김
		
		System.out.println("i2= " + i2);
		System.out.println("b2= " + b2);
		
	}

}

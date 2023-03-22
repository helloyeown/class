package chapter02;

public class Casting1 {

	public static void main(String[] args) {

		double d = 100.0;
		System.out.println("d= " + d);
		
		int i = 100;
		
		int result = i + (int)d;
		int result2 = (int)(i + d);
		
		System.out.println("d= " + d);
		System.out.println("i= " + i);
		System.out.println("result= " + result);
		System.out.println("result2= " + result2);
		
	}

}

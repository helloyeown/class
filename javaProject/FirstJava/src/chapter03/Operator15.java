package chapter03;

public class Operator15 {

	public static void main(String[] args) {
		
		int num1 = 2;
		int num2 = 5;
		
		int min = (num1 < num2) ? num1 : num2;
		System.out.println("min= " + min);
		
		int max = (num1 < num2) ? num2 : num1;
		System.out.println("max= " + max);
		
		String result = (num1%2 == 0) ? "짝수" : "홀수";
		System.out.println("num1= " + result);
		
		result = (num2%2 == 0) ? "짝수" : "홀수";
		System.out.println("num2= " + result);
		
	}
}

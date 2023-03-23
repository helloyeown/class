package chapter04;

public class IfTest4 {

	public static void main(String[] args) {
		
		// 양수, 음수, 0 판별
		
		int number = 1;
		
		// 양수: 0보다 큰 수 (number>0)
		// 음수: 0보다 작은 수	(number<0)
		
		if(number>0) {
			System.out.println("양수");
		} else if(number==0) {
			System.out.println("0");
		} else {
			System.out.println("음수");
		}
		
	}
}

package chapter04;

public class IfTest5 {

	public static void main(String[] args) {
		
		// if문 내부에 또 다른 if문 중첩 가능
		
		// 양수, 음수, 0 판별
		int number = 10;
		
		if(number>0) {
			System.out.println("양수");
			if(number%2==0) {
				System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		} else {
			if(number<0) {
				System.out.println("음수");
			} else {
				System.out.println("0");
			}
		}
		
		
		
		
		
		
	}
}

package chapter04.quiz;

public class Quiz04 {

	public static void main(String[] args) {

		//		switch문이 아닌, if~else를 사용하는 형태로 변경

		int n = 1;

		if(n==1) {
			System.out.println("AAA");
		} else if(n==2) {
			System.out.println("BBB");
		} else if(n==3) {
			System.out.println("CCC");
		} else {
			System.out.println("DDD");
		}
		
		
		
//		switch(n) {
//		case 1:		//n==1
//			System.out.println("AAA");
//			break;
//		case 2:		//n==2
//			System.out.println("BBB");
//			break;
//		case 3:		//n==3
//			System.out.println("CCC");
//			break;
//		default:	//else
//			System.out.println("DDD");
//		}
		
		System.out.println("프로그램을 종료합니다");

	}
}

package chapter04;

public class IfTest3 {

	public static void main(String[] args) {
		
//		- 점수가 90점 이상인 경우 “A”를 출력하고
//		- 80점 이상이면서 90점 미만인 경우 “B”를 출력
//		- 앞의 두 조건에 맞지 않는 이외의 경우에는 “C”를 출력
		
		int score = 100;
		
		if(score>=90) {
//			System.out.println("A");
			if(score>96) {
				System.out.println("A+");
			} else if(score>93) {
				System.out.println("A");
			} else {
				System.out.println("A-");
			}
		} else if(score>=80) {		//80~89
			System.out.println("B");
		} else {
			System.out.println("C");
		}
		
	}
}

package chapter04;

public class SwitchCase1 {

	public static void main(String[] args) {
		
		int score = 100;
		
		//점수별 학점 체크
		//score/10
//		100->10
//		90~99->9  (90이상 100미만)
//		80~89->8  (80이상 90미만)
	
		switch (score/10) {
		case 10:
			System.out.println("A");
			break;
		
		case 9:
			System.out.println("A");
			break;
		
		case 8:
			System.out.println("B");
			break;
		
		case 7:
			System.out.println("C");
			break;
		
		case 6:
			System.out.println("D");
			break;
		
		default:
			System.out.println("F");
		}
		
		
		
		
		
		
		
		
		int key = 60;
		
		switch (key) {
		case 10:	//key == 10일 때
			System.out.println("10입니다");
			break;	//감싸고 있는 블록을 탈출(없으면 아래 문장 다 실행됨)
			
		case 20:
			System.out.println("20입니다");
			break;

//		default:
//			System.out.println("10 또는 20이 아닙니다");
//			break;
		}
		
		
		
		
		
		
	}
}

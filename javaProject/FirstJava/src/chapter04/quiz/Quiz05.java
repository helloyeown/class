package chapter04.quiz;

public class Quiz05 {

	public static void main(String[] args) {
		
		//		switch문으로 변경
		//		num < 0 이라면 “0 미만” 출력 부분은 if문을 사용하고 나머지 조건에 대해 변경
		
		//		if(num<0) System.out.println("0 미만");
		//		if(0<num && num<100) System.out.println("0이상 100 미만");
		//		if(100<=num && num<200) System.out.println("100이상 200 미만");
		//		if(200<=num && num<200) System.out.println("200이상 300 미만");
		//		if(300<=num) System.out.println("300이상");
		
		
		int num = 120;
		
		if(num<0) {
			System.out.println("0 미만");
		} else {
			
			switch(num/100) {
			case 0: //0~99
				System.out.println("0이상 100미만");
				break;
			case 1: //100~199
				System.out.println("100이상 200미만");
				break;
			case 2: //200~299
				System.out.println("200이상 299미만");
				break;
			default: System.out.println("300이상");
			}
			
		}
		
		
		
	}
}

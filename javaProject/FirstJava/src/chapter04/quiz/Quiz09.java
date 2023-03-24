package chapter04.quiz;

public class Quiz09 {

	public static void main(String[] args) {
		
//		for 문을 이용하여 1부터 10까지를(반복) 곱해서 그 결과를 출력하는 프로그램을 작성
		
		int result = 1;
		
		for(int i=1; i<=10; i++) {
			result *= i;
		}
		
		System.out.println(result);
		
	}
}

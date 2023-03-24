package chapter04.quiz;

public class Quiz14 {

	public static void main(String[] args) {

		//		다음 식을 만족하는 조합을 찾는 프로그램 작성. 
		//	    A B
		//	 +  B A
		//	   ------
		//	    9 9

		//		(10A+B) + (10B+A) = 99
		//				11A+11B = 99 -> A+B=9 -> B=9-A



		for(int i=0; i<10; i++) {
			int a = i;
			int b = 9-a;

			System.out.println("A: " + a + ", B: " + b);

		}

	}
}

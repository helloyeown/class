package quiz;

public class Quiz14 {

	public static void main(String[] args) {
		
//		다음 식을 만족하는 조합을 찾는 프로그램 작성. 
//	    A B
//	 +  B A
//	   ------
//	    9 9
		
		
		int a=0;
		int b=0;
		
		for(a=0; a<10; a++) {
			for(b=0; b<10; b++) {
				if(a+b==9) {
					System.out.println(a+" "+b);
				}
			}
		}
		
		
		
		
		
		
	}
}

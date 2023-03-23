package chapter04;

public class WhileLoop3 {

	public static void main(String[] args) {
		
		int num = 0;
		
		while(true) {
			
			// 탈출 조건
			if(num==5) {
				break;
			}
			
			System.out.println(num++);
		}
		
	}
}

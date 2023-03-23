package chapter04;

public class WhileLoop4 {

	public static void main(String[] args) {
		
		// 1~10 짝수 출력
		int num = 0;
		
		while(num<10) {
			num++;
			if(num%2==1) {
				continue;
			}
			System.out.println(num);
		}
		
	}
}

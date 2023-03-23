package chapter04;

public class LoopTest {

	public static void main(String[] args) {
		
		// 1~10 범위의 숫자들의 합
		//0+1+2+3+4+5+6+7+8+9+10
		
		int num = 1;	//증가값
		int sum = 0;	//초기값
		
		while(num<=10) {
			System.out.println(num + "\t " + sum);
			
			sum+=num;
			
			num++;
		}
		
		System.out.println("합: " + sum);
		
	}
}

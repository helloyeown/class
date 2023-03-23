package quiz;

public class Quiz16 {

	public static void main(String[] args) {
		
//		1 부터 99까지의 합을 구하는 프로그램 작성
//		while문, for문, do while 문을 각각 사용
		
		int sum=0;
		int i=1;
		
//		for(i=1; i<100; i++) {
//			sum = sum+i;
//		}
//		System.out.println(sum);
		
		
		
//		while(i<100) {
//			sum+=i;
//			i++;
//		}
//		System.out.println(sum);
		
		
		do {
			sum+=i;
			i++;
		} while(i<100);
		
		System.out.println(sum);
		
		
		
		
		
	}
}

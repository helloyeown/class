package chapter09;

public class SystemCurrentTimeMillis {

	public static void main(String[] args) {
		// 특정 작업의 처리 시간 체크(성능 체크)
		long startTime = System.currentTimeMillis();
		long sTime = System.nanoTime();
		System.out.println(startTime);
		
		// 처리할 것
		int sum = 0;
		for(int i=0; i<10000000; i++) {
			int n1 = 1;
			int n2 = 2;
			sum += i;
		}
		
		long endTime = System.currentTimeMillis();	// 종료 타임
		long eTime = System.nanoTime();
		
		long result = endTime - startTime;
		long result2 = eTime - sTime;
		System.out.println("실행 시간: " + result + " ms");
		System.out.println("실행 시간: " + result2 + " ns");
		
	}
}
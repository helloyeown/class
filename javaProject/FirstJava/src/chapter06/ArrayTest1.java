package chapter06;

public class ArrayTest1 {

	public static void main(String[] args) {

//		// 배열 선언
//		int[] scores;	// int 타입의 배열 인스턴스 주소를 가지는 변수
//
//		// 배열 생성
//		scores = new int[10];	// int 타입의 요소 10개를 가지는 배열 인스턴스 생성
		
		
		int[] scores = new int[10];
		// int 타입의 배열(사이즈10)을 생성
		
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
		}
		
		System.out.println();	//초기화하지 않아서 모두 0으로 출력됨(타입별 기본값)

		// 배열 요소 참조
		// 배열이름[index]
		// index: 0 ~ n-1
		// 요소의 갯수: 배열변수.length

		scores[0] = 100;
		scores[1] = 81;
		scores[2] = 63;
		scores[3] = 70;
		scores[4] = 89;
		scores[5] = 57;
		scores[6] = 97;
		scores[7] = 86;
		scores[8] = 65;
		scores[9] = 69;
//		System.out.println(scores[1]);

		
		// 총합, 평균
		int sum = 0;
		float avg = 0.0f;
		
		for(int i=0; i<scores.length; i++) {
			System.out.println(scores[i]);
			sum += scores[i];
			avg = sum / (float)scores.length;
		}
		
		System.out.println("총합: " + sum);
		System.out.println("평균: " + avg);

	}
}
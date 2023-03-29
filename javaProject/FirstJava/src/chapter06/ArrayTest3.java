package chapter06;

public class ArrayTest3 {

	public static void main(String[] args) {

		int [] scores = new int[10];	// int 타입의 요소 10개를 가지는 배열 인스턴스 생성

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

		resultPrint(scores);

	}


	// 점수를 저장하고 있는 배열을 전달받아 총점과 평균을 출력하는 메소드

	static void resultPrint(int[] arr) {
		//전달받을 배열: int 타입, size 제약 없음
		int sum = 0;
		float avg = 0.0f;

		for(int i=0; i<arr.length; i++) {
			sum += arr[i];
		}
		avg = sum / (float)arr.length;

		System.out.println("총점: " + sum);
		System.out.println("평균: " + avg);
	}

}
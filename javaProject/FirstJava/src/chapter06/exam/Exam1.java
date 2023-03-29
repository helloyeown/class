package chapter06.exam;

public class Exam1 {

	//	국어, 영어, 수학 점수 10개씩을 저장하는 배열을 정의하고 점수를 모두 출력하고, 
	//	평균 점수를 출력하는 프로그램을 작성해봅시다.

	public static void main(String[] args) {

		int[][] score = {
				{100, 90, 80},
				{98, 76, 90},
				{85, 84, 77},
				{89, 99, 69},
				{100, 90, 80},
				{98, 76, 90},
				{85, 84, 77},
				{89, 100, 69},
				{85, 84, 77},
				{88, 100, 69}
		};

		
		System.out.println("국어\t영어\t수학\t총점\t평균");
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.print(score[i][j] + "\t");
				sum += score[i][j];
			}
			System.out.print(sum + "\t");
			System.out.print(sum / (float)score[i].length);
			System.out.println();
		}



	}

}

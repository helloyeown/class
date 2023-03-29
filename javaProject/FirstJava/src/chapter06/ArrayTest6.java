package chapter06;

public class ArrayTest6 {
	public static void main(String[] args) {
		
		int[][] scores = {
				{100, 90, 80},
				{98, 76, 65},
				{88, 91, 50},
				{90, 50, 100}
		};
		
		
//		for(int[] score : scores) {
//			for(int s : score) {
//				System.out.print(s + " ");
//			}
//			System.out.println();
//		}
		
		
		
		// 행을 반복
		for(int i=0; i<scores.length; i++) {
			// scores[i] -> 반복하면서 각각의 1차원 배열
			
			// 열의 반복: 각 1차원 배열의 요소를 출력
			for(int j=0; j<scores[i].length; j++) {
				System.out.print("numbers["+i+"]["+j+"] => " + scores[i][j] + "\t");
			}
			System.out.println();
		}
	}
}

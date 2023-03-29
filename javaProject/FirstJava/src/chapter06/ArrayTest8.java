package chapter06;

public class ArrayTest8 {
	public static void main(String[] args) {
		
		int[][] arr = {
				{100, 80, 40}, 
				{60, 70, 80}	
		};
		
		// 2차원 배열은 1차원 배열들을 요소로 갖는 배열
		// arr[0] -> 1차원 배열을 갖는 배열 변수(주소값)
		// arr[1] -> 1차원 배열을 갖는 배열 변수(주소값)
		
		for(int[] temp : arr) {
			// int[] temp = {100, 80, 4};
			// int[] temp = {60, 70, 80};
			for(int num : temp) {
				System.out.print(num + "\t");
			}
			System.out.println();
		}
	}
}

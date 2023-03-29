package chapter06;

public class ArrayTest4 {

	public static void main(String[] args) {
		
		// 2차원 배열 선언
		int[][] arr;
		
		// 2차원 배열 생성(사이즈 설정 3행 2열)
		arr = new int[3][2];
		
		// 배열의 사이즈
		System.out.println("2차원 배열의 사이즈: " + arr.length); //3 (행)
		
		System.out.println("첫 번째 배열의 사이즈: " + arr[0].length);	//2 (열)
		System.out.println("두 번째 배열의 사이즈: " + arr[1].length);	//2
		System.out.println("세 번째 배열의 사이즈: " + arr[2].length);	//2
		
		arr[0][0] = 11;
		arr[0][1] = 12;
		arr[1][0] = 21;
		arr[1][1] = 22;
		
		System.out.println(arr[0][0]);
		System.out.println(arr[0][1]);
		System.out.println(arr[1][0]);
		System.out.println(arr[1][1]);
		
	}
}
package chapter04.quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {

		// 한 개의 if 문만 사용하는 방식으로 변경
		// int num=120;
		// if(num>0) {
		// if((num%2)==0)
		// System.out.println(“양수이면서 짝수");
		// }

		
		Scanner in = new Scanner(System.in);
		
		System.out.print("숫자를 입력하세요.>>");
		int num=0;	//사용자로부터 숫자 입력 받아 판별
		num = in.nextInt();
		
		
		if(num>0 && num%2==0) {
			System.out.println("양수이면서 짝수");
		} else {
			System.out.println("양수가 아니거나 짝수가 아님");
		}
		
	}
}

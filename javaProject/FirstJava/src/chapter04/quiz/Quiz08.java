package chapter04.quiz;

public class Quiz08 {

	public static void main(String[] args) {
		
//		1. 1000 이하의 자연수 중(조건)에서 2의 배수 이면서 7의 배수인(조건) 숫자를 출력
//		2. 그 출력된 숫자들의 합을 구하는 프로그램을 while 문을 이용해서 작성
		
		
		int num=1;
		int sum=0;
		
		while(num<1000) {
			if(num%2==0 && num%7==0) {
				System.out.println(num);
				sum+=num;
			}
			num++;
		}
	
		System.out.println("합: " + sum);
		
		
	}
}

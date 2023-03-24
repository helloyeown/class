package chapter04.quiz;

public class Quiz03 {
	public static void main(String[] args) {

		//		if~else로 변경

		int num1=50, num2=100;
		int big, diff;

		//        big = (num1>num2)? num1:num2;
		//        System.out.println(big);
		//        diff = (num1>num2)? num1-num2: num2-num1;
		//        System.out.println(diff);

		//		  두 값 중 큰 수를 찾아 출력, 두 값의 차를 출력
		//	 	큰 수: 두 수를 비교해서 판별
		//		두 수의 차: 두 수의 큰 수와 작은 수를 구해서 큰 수-작은 수


		if(num1>num2) {
			big = num1;
			diff = num1-num2;
		} else {
			big = num2;
			diff = num2-num1;
		}
		
		System.out.println(big);
		System.out.println(diff);

	}
}

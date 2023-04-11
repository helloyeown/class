package studyExam;

public class Exam8 {

	public static void main(String[] args) {
		
//		변수 money에 10 ~ 5000사이의 난수를 발생시켜 넣는다.
//		단, 3450, 2100, 60과 같이 1의자리 숫자는 반드시 0이 되도록 한다.
//
//		발생된 난수 money를 동전으로 바꾸면 각 동전이 몇개씩 필요한지를 판단하는 코드를 작성
//		가능한한 적은 수의 동전을 사용하도록 한다.
//
//		2590 -> 500원 : 5개, 50원 : 1개, 10원 : 4개
//		for문 1개
		
		int money = 0;
		
		for(int i=10; i<=5000; i++) {
			money = (int)((Math.random()*5000)+1)/10*10;
		}
		
		System.out.println(money);
		
		System.out.println("500원: " + money/500);
		money%=500;
		
		System.out.println("50원: " + (int)money/50);
		money%=50;
		
		System.out.println("10원: " + (int)money/10);
		
	}
}

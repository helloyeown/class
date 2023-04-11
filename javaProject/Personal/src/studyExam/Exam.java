package studyExam;

public class Exam {

	public static void main(String[] args) {
		
//		1부터 100까지 출력한 후, 다시 거꾸로 100부터 1까지 출력하는 프로그램을 작성. while문과 do~while 문을 각각 한번씩 사용해서 작성
//
//		심화 - for문을 이용해서도 만들어보기
//		심화2 -한 행에 10개씩만 출력하기
//
//		요건데 for문에서 1부터 100까지 10개씩 출력!!

		for(int i=1; i<=100; i++) {
			System.out.print(i + " ");
			if(i%10==0) {
				System.out.println();
			}
		}
	}
}

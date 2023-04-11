package studyExam;

public class Exam5 {

	public static void main(String[] args) {
		
//		2중 for문을 사용하여 아래의 결과를 출력하시오
//		1 2 3 4 5 6 7 8 9 10
//		2 3 4 5 6 7 8 9 10 1
//		3 4 5 6 7 8 9 10 1 2
//		...............
//		10 1 2 3 4 5 6 7 8 9
//
//		for문과 if문
		
		int i=0;

		for(i=1; i<=10; i++) {
			for(int j=1; j<=11; j++) {
				System.out.print(j + " ");
				
				if(j>10) {
					
				}
				
			}
			System.out.println();
		}
		
	}
}

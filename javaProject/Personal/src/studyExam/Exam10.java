package studyExam;

public class Exam10 {

	public static void main(String[] args) {
		
//		A B C D
//		E F G H
//		I J K L
//		다차원배열로 위와 같이 출력하기
		
		char[][] letter = {
				{'A', 'B', 'C', 'D'},
				{'E', 'F', 'G', 'H'},
				{'I', 'J', 'K', 'L'}
		};
		
		for(int i=0; i<letter.length; i++) {
			System.out.println(letter[i]);
		}
		
	}
}

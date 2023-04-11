package studyExam;

import java.util.LinkedList;
import java.util.List;

public class Exam9 {

	public static void main(String[] args) {
		
//		1 ~ 45사이의 난수를 발생시켜 lotto배열에 담아, 번호를 생성하는 프로그램을 작성(중복숫자x)
		
		List lotto = new LinkedList<>();
		
		for(int i=0; lotto.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			lotto.add(num);
		}
		
		System.out.println(lotto);
		
	}
}

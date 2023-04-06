package chapter11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class CollectionsTest {

	public static void main(String[] args) {
		
		List<Integer> lottoNumber = new ArrayList<Integer>();
		for(int i=0; i<6; i++) {
			int n = new Random(System.nanoTime()).nextInt(45)+1;
			lottoNumber.add(n);
		}
		
		System.out.println("최초 입력데이터");
		displayList(lottoNumber);
		
		System.out.println("최대값: " + Collections.max(lottoNumber));
		System.out.println("최소값: " + Collections.min(lottoNumber));
		
		Collections.sort(lottoNumber);	// 오름차순
		displayList(lottoNumber);
		
		Collections.reverse(lottoNumber);	// 순서 뒤집기
		displayList(lottoNumber);
		
		Collections.shuffle(lottoNumber);	// 섞기
		displayList(lottoNumber);
		
	}
	
	static <E> void displayList(List<E> list) {
		System.out.println("=================");
		for(E num : list) {
			System.out.println(num);
		}
	}
}
package chapter11;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class Ex10 {

	public static void main(String[] args) {
		
		Set set = new HashSet();
		
		for(int i=0; set.size()<6; i++) {
			int num = (int)(Math.random()*45)+1;
			set.add(num);
		}
		
		List list = new LinkedList(set);
		// sort(정렬)메소드를 사용하려면 List가 필요
		// LinkedList에 set을 넣음
		Collections.sort(list);	// 오름차순 정렬
		System.out.println(list);
	}
}

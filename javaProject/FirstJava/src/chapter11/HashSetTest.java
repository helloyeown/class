package chapter11;

import java.util.HashSet;

public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<>();

		set.add("손흥민");
		set.add("박지성");
		set.add("이강인");
		set.add("손흥민");
		set.add("이강인");
		// 중복 요소는 들어가지 않음
		// 순서가 없음

		System.out.println("요소의 개수: " + set.size());

		for (String member : set) {
			System.out.println(member);
		}
		
		
		HashSet<Integer> number = new HashSet<>();
		number.add(10);	// auto-boxing		
		number.add(20);
		number.add(30);
		number.add(10);
		number.add(30);
		// 중복 요소 들어가지 않음
		
		for(int num : number) {	// 순서 뒤죽박죽(순서가 없음)
			System.out.println(num);
		}
		
		
	}

}

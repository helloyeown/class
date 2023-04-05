package chapter11;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListTest {

	public static void main(String[] args) {
		
		List<Integer> numbers = new LinkedList<Integer>();
		numbers.add(10);
		numbers.add(new Integer(20));
		numbers.add(30);
		numbers.add(10);
		numbers.add(20);
		
		// 반복자 Iterator<E> -> Collection<E> 구현하는 객체들의 전체 참조 목적
		Iterator<Integer> itr = numbers.iterator();
		
		System.out.println("Iterator를 이용한 전체 참조");
		while(itr.hasNext()) {
			// System.out.println(itr.next());
			int num = itr.next();
			System.out.println(100 + num);
		}
		
		
		System.out.println("==============");
		
		
		
		for(int n : numbers) {
			System.out.println(n);
		}
		
		
		// Collection<E> -> List<E> -> ArrayList<E>
		// String 타입의 객체를 저장 -> String 타입의 인스턴스를 참조하는 참조값 저장
		LinkedList<String> list = new LinkedList<String>();
		
		// 인스턴스 저장 -> 요소 저장 add()
		list.add("손흥민");	// index0 (순서대로 저장)
		list.add(new String("박지성"));	//index1
		list.add(new String("이강인"));
		
		// 데이터 참조: get()
		// String name = list.get(10);	// IndexOutOfBoundsException
		String name = list.get(0);	// 손흥민
		System.out.println(name);
		System.out.println(list.get(1));	// 박
		System.out.println(list.get(2));	// 이 
		System.out.println("================");
		
		// 특정 위치에 요소 삽입
		// 배열에선 삽입하기 위해 특정 위치 이후의 값을 모두 뒤로 shift해야 하지만
		// ArrayList 클래스 내부에는 기능이 갖추어져 있음
		list.add(1, "안정환");
		// 1 이후의 값이 한 칸씩 뒤로 밀림
		System.out.println(list.get(0));	// 손
		System.out.println(list.get(1));	// 안
		System.out.println(list.get(2));	// 박
		System.out.println(list.get(3));	// 이
		
		// 저장된 요소의 갯수: size()
		System.out.println("저장된 이름의 갯수: " + list.size());	//4
		System.out.println("index: 0~" + (list.size()-1));	//0~3
		System.out.println("================");
		
		// 반복문을 이용해서 일괄 처리
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i) + " : " + list.get(i).charAt(0));
			// list.get(i) -> 참조값 + .charAt()
		}
		
		System.out.println("================");
		for(String playerName : list) {
			System.out.println(playerName + ":" + playerName.charAt(2));
		}
		
		if(list.contains("손흥민")) {
			System.out.println("화이팅");
		}
		
		// 목록에서 지우기: remove()
		if(list.contains("안정환")) {
			// 안정환 선수 하차
			list.remove("안정환");
			list.remove(0);
		}
		
		System.out.println("================");
		for(String playerName : list) {
			System.out.println(playerName + ":" + playerName.charAt(2));
		}
		
		// 전체 요소 삭제: clear()
		list.clear();
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		
	}
}

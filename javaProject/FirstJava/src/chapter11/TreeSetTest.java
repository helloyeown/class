package chapter11;

import java.util.TreeSet;

public class TreeSetTest {

	public static void main(String[] args) {
		
		TreeSet<SmartPhone> phones = new TreeSet<>();
		
		phones.add(new SmartPhone("Spring", "010-9999-9999"));
		phones.add(new SmartPhone("King", "010-0000-0000"));
		phones.add(new SmartPhone("Adam", "010-1111-1111"));
		phones.add(new SmartPhone("Scott", "010-3333-3333"));
		phones.add(new SmartPhone("Smith", "010-7777-7777"));
		
		for(SmartPhone phone : phones) {
			System.out.println(phone);
		}
		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(100);
		numbers.add(60);
		numbers.add(30);
		numbers.add(70);
		
		for(int num : numbers) {
			System.out.println(num);
		}
	}
}

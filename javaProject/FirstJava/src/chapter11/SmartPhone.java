package chapter11;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class SmartPhone implements Comparable<SmartPhone> {

	private String name;
	private String phoneNumber;

	public SmartPhone(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}



	@Override
	public String toString() {
		return "SmartPhone [name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}



	@Override
	public int hashCode() {
		// 010-9876-5432
		// 고유의 값(int)을 내가 정의함
		return this.phoneNumber.charAt(phoneNumber.length()-1)%5;
		// 0,1,2,3,4
	}

	@Override
	public boolean equals(Object obj) {

		boolean result = false;

		if(obj!=null && obj instanceof SmartPhone) {
			SmartPhone sp = (SmartPhone)obj;
			result = phoneNumber.equals(sp.getPhoneNumber());
			// private이어서 get 메소드를 통해 받아야 함
		}

		return result;
	}


	@Override
	public int compareTo(SmartPhone o) {
		return name.compareTo(o.getName());
		// 오름차순을 내림차순 정렬로 바꿈 (*-1)
	}


	public static void main(String[] args) {

		Set<SmartPhone> phones = new HashSet<SmartPhone>();

		phones.add(new SmartPhone("손흥민", "010-1234-5678"));
		phones.add(new SmartPhone("박지성", "010-3333-7777"));
		phones.add(new SmartPhone("이강인", "010-1234-5678"));
		phones.add(new SmartPhone("차두리", "010-1234-5679"));

//		for(SmartPhone phone : phones) {
//			System.out.println(phone);
//		}
		
		phones.stream().sorted().forEach(System.out::println);	// 오름차순
		phones.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		// stream 객체의 sorted 정렬 메소드
		// 기본 오름차순
		// 반대조건(*-1) or sorted(Comparator.reverseOrder()) 내림차순
		
	}
}

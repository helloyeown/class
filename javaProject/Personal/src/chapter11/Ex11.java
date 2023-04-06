package chapter11;

import java.util.HashSet;
import java.util.Objects;

public class Ex11 {

	public static void main(String[] args) {

		HashSet set = new HashSet<>();
		set.add("abc");
		set.add("abc");
		set.add(new Person("예원",29));
		set.add(new Person("예원",29));
		
		System.out.println(set);
	}

}

class Person{

	String name;
	int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return name + ": " + age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, age);
		// 해시코드로 name, age 설정
	}

	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Person)) return false;
		// 같은 타입인지 먼저 검사
		Person p = (Person)obj;
		// Person타입 p에 형변환한 obj 대입
		return name.equals(p.name) && age==p.age;
		// p.name(매개변수로 들어온) 값과 age 값이 일치하면 true 반환
	}
}

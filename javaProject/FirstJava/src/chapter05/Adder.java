package chapter05;

public class Adder {

	int add(int n1, int n2) {
		System.out.println("두 정수의 합");
		return n1+n2;
	}
	
	float add(float n1, float n2) {
		System.out.println("두 실수의 합");
		return n1+n2;
	}
	
//	void add(int n1, int n2) {		// 1번 메소드랑 중복(리턴 타입은 달라도 의미 없음)
//		System.out.println(n1+n2);
//	}
	
	void add(int n1) {		// 1번 메소드랑 중복(리턴 타입은 달라도 의미 없음)
		System.out.println(n1+n1);
	}
	
}

package chapter08;

// 추상클래스: 추상 메소드를 하나 이상 가진 클래스, 미완성 -> 인스턴스 생성 불가, 상속 목적
public abstract class AbstractClass {

	int num;
	String name;
	
	// 추상메소드: 미완성 메소드 {} -> ;, abstract 키워드
	// 오버라이딩의 대상이 됨
	abstract void abstractMethod();
	
	void instanceMethod() {
		abstractMethod();	// 오류 아님
		// 실행되는 시점엔 추상 메소드가 구현되었을 것이기 때문
	}
	
	void printData() {
		System.out.println(name);
	}
	
}
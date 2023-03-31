package chapter08;

public class Main {

	public static void main(String[] args) {


		AbstractClass abstractClass;	// 참조변수 선언, 상위 타입
//		abstractClass = new AbstractClass();	// 인스턴스 생성 불가
		
		NewClass class1 = new NewClass();
		class1.abstractMethod();	// 오버라이딩 된 메소드
		class1.instanceMethod();
		class1.printData();
	}
}

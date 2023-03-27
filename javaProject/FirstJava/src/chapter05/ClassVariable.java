package chapter05;

public class ClassVariable {

	static String name = "KING";	//static+iv = 클래스 변수 (프로그램 실행될 때 생성됨)
	static int age = 12;
	
	void tellName() {
		System.out.println("제 이름은 " + name + "입니다");
	}
	
	void tellAge() {
		System.out.println("나이는 " + age + "입니다");
	}
	
	
}

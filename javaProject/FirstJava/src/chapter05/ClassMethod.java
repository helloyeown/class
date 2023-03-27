package chapter05;

public class ClassMethod {

	int iv = 10;	//인스턴스 변수
	
	static int cv = 30;		//클래스 변수
	
	// 인스턴스 메소드
	void printNumber1() {
		System.out.println(iv);
		System.out.println(cv);
	}
	
	// 클래스 메소드: 인스턴스 멤버를 이 안에서 사용하려면 객체 생성을 먼저 해야 함
	static void printNumber2() {
		System.out.println("Class Method");
		
//		printNumber1();
		
		ClassMethod cm = new ClassMethod();
		System.out.println(cm.iv);
		cm.printNumber1();
	}
	
	
	public static void main(String[] args) {
		
		// 클래스 메소드의 호출: 클래스이름.메소드이름();
		ClassMethod.printNumber2();
		
	}
}
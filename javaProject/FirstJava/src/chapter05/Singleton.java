package chapter05;

public class Singleton {

	// 1. 다른 클래스에서 Singleton 클래스를 이용해서 인스턴스 생성을 막음
	private Singleton() {}
	
	// 2. 내부에서 Singleton 클래스로 인스턴스 생성
	private static Singleton s = new Singleton();
	
	// 3. 내부에서 만들어진 참조값을 외부에서 사용할 수 있도록 참조값 반환하는 메소드
	public static Singleton getInstance() {
		if(s==null) {
			s = new Singleton();
		}
		return s;
	}
	
	public void printData() {
		System.out.println("데이터를 출력합니다.");
	}
}

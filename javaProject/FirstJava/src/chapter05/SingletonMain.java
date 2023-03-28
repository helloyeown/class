package chapter05;

public class SingletonMain {

	public static void main(String[] args) {
		
		Singleton s = Singleton.getInstance();
//		s = new Singleton();	// 외부에서 인스턴스 생성 불가
		s.printData();
		
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		
	}
}

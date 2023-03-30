package chapter07;

public class SmartPhone extends Phone {
	
	// 자식 클래스:
	// 좁은 의미, 기능의 확장
	
	String model;	// 추가된 변수
	
	public SmartPhone() {
		super();
	}
	
	void game() {	// 추가된 기능
		System.out.println(model + " 게임");
	}
	
	
	
	public static void main(String[] args) {
		
		SmartPhone sp = new SmartPhone();
		
		sp.phoneNumber = "01012345678";
		sp.call();
		
		sp.model = "iPhone";
		sp.game();
		
	}
}
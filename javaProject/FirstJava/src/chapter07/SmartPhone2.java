package chapter07;

public class SmartPhone2 extends Phone {
	
	String model;

	// 상위 클래스에 매개 변수가 있는 생성자가 있다면
	// 상위 클래스의 멤버를 초기화 할 데이터를 받아서
	// 상위 클래스의 생성자를 호출해줘야 한다
	// 현재 클래스의 멤버를 초기화한다
	public SmartPhone2(String phoneNumber, String model) {
		super(phoneNumber);	// 상위클래스 생성자 호출
		// 현재 클래스 인스턴스 변수의 초기화
		this.model = model;
	}
	
	

	void game() {
		call();
		System.out.println(model + " 게임");
	}
	
	
	public static void main(String[] args) {
		
		SmartPhone2 smartPhone = new SmartPhone2("01012345678", "iPhone");
		
		smartPhone.game();
		
	}
}

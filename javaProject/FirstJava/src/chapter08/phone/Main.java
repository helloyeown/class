package chapter08.phone;


public class Main {

	public static void main(String[] args) {
		
//		System.out.println(Phone.PHONE_NUM_3);	// static 변수 호출
		
//		Phone phone = null;	// 구현 전
//		SmartPhone phone = new SmartPhone();	// = new 구현한 클래스();
//		// 1. 전원을 켠다
//		phone.turnOn();
//		// 2. 통화를 한다
//		phone.call();
//		// 3. 전원을 끈다
//		phone.turnOff();
		
		
		Phone phone2 = new SmartPhone2();
		////////////////
		// 1. 전원을 켠다
		phone2.turnOn();
		// 2. 통화를 한다
		phone2.call();
		// 3. 게임을 한다
		((SmartPhone2)phone2).gamePlay();	// 다형성
		// 4. 전원을 끈다
		phone2.turnOff();
		
		
		SmartPhone2 phone3 = new SmartPhone2();
		phone3.calculator();
		phone3.call();
		
	}
}

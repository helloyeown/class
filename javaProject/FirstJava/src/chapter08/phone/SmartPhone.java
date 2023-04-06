package chapter08.phone;

public class SmartPhone implements Phone {
	
	boolean power;	// 초기값: false
	
	public SmartPhone(){}

	@Override
	public void call() {
		String number1 = String.valueOf(PHONE_NUM_1);
		String number2 = String.valueOf(PHONE_NUM_1);
		String number3 = String.valueOf(PHONE_NUM_9);
		System.out.println(number1+number2+number3 + "로 전화를 겁니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다");
		if(!power)	// 꺼져있는 상태
			power = true;
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다");
		if(power)	// 켜져있는 상태
			power = false;
	}
}

package chapter08;

public class SmartPhone extends Phone {
	
	String model;

	public SmartPhone(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void turnOn() {
		System.out.println(model + " 모델에 맞게 전원을 켰습니다.");
	}

	public static void main(String[] args) {
		
		
		
		Phone smartPhone = new SmartPhone("010-3333-7777", "IOS");
		smartPhone.turnOn();
		
	}
	
}

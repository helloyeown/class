package chapter08;

public abstract class Phone {

	String phoneNumber;

	public Phone(String phoneNumber) {
		super();
		this.phoneNumber = phoneNumber;
	}
	
	void call() {
		System.out.println(phoneNumber + "에서 전화를 겁니다.");
	}
	
	abstract void turnOn();
	
}

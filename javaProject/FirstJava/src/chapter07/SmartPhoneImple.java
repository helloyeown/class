package chapter07;

public class SmartPhoneImple extends Phone {

	String model;

	public SmartPhoneImple(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void call() {
		super.call();	// 상위 클래스 메소드 호출
		System.out.println("이어팟으로 통화합니다");
	}
	
	
	public static void main(String[] args) {
		
		SmartPhoneImple phone = new SmartPhoneImple("01044449999", "google");
		
		phone.call();
		
	}
}
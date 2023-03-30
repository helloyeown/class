package chapter07;

public class IPhone extends Phone {
	
	public IPhone(String phoneNumber) {
		super(phoneNumber);
	}

	@Override
	void call() {
		super.call();
		System.out.println("아이폰으로 통화");
	}
}

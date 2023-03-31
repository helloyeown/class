package chapter08.phone;

public interface Phone {

	// 상수: 값이 변하지 않는 변수 -> 최초 입력 후에 값 변경 불가
	// 인터페이스에서 변수는 상수 형태로만 구성됨
	public static final int PHONE_NUM_1 = 1;
	// public static final 생략 가능
	int PHONE_NUM_2 = 2;
	int PHONE_NUM_3 = 3;
	int PHONE_NUM_4 = 4;
	int PHONE_NUM_5 = 5;
	int PHONE_NUM_6 = 6;
	int PHONE_NUM_7 = 7;
	int PHONE_NUM_8 = 8;
	int PHONE_NUM_9 = 9;
	int PHONE_NUM_0 = 0;

	
	//추상메소드
	public abstract void call();
	// public abstract 생략 가능
	public abstract void turnOn();
	public abstract void turnOff();
	
}

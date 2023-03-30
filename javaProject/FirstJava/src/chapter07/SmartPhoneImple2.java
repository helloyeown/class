package chapter07;

public class SmartPhoneImple2 extends Phone {

	String model;

	public SmartPhoneImple2(String phoneNumber, String model) {
		super(phoneNumber);
		this.model = model;
	}

	@Override
	void call() {
		super.call();	// 상위 클래스 메소드 호출
		System.out.println(model + "에어팟으로 통화합니다");
	}


	void playMusic() {
		System.out.println("음악을 듣습니다");
	}


	public static void main(String[] args) {

		// 다형성: 상위 타입의 참조변수로 다양한 하위 타입의 인스턴스를 참조
		Phone p = new SmartPhoneImple2("01057579949", "IOS");
		p.call();	// 하위 클래스에서 오버라이딩 된 call() 호출됨
		// 하위 클래스의 변수 model 사용(메소드에 포함되어 있음)
		//		p.playMusic();	// 오류, 하위 클래스의 메소드
		
		SmartPhoneImple2 p2 = (SmartPhoneImple2)p;	//명시적 형변환 (상위->하위)
		p2.playMusic();
	}
}
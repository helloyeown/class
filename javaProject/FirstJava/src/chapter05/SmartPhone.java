package chapter05;

public class SmartPhone {

	// 변수 선언(속성) : 멤버변수, 인스턴스 변수
	String color = "white";		// 속성: 색상
	float size = 5.7f;			// 속성: 사이즈
	int volume = 0;				// 속성: 볼륨 크기
	
	
	//메소드 정의(기능) : 인스턴스 메소드
	//전화 거는 기능
	void call() {
		System.out.println("전화를 겁니다");
	}
	
	//볼륨 키우는 기능
	void volumeUp() {
		volume++;
	}

	//볼륨 줄이는 기능
	void volumeDown() {
		volume--;
	}
	
	
	
	public static void main(String[] args) {
		
		// 클래스를 인스턴스화
		// 인스턴스화: 클래스에 정의된 변수와 메소드가 메모리로 로드됨
		// 참조변수 선언 = new 클래스이름();
		
		// 참조변수 선언: 클래스이름 변수이름(인스턴스 메모리 주소값 저장)
		SmartPhone sp = null;	// 참조변수의 초기화는 null값 사용
		
		sp = new SmartPhone();	// new 키워드로 인스턴스 생성
		// 인스턴스의 생성: 클래스에 정의된 멤버들이 메모리로 로드됨
		// 인스턴스 메모리의 주소값 반환
		
		// 인스턴스 변수의 참조: 참조변수.변수이름
		System.out.println("스마트폰 색상: " + sp.color);
		System.out.println("스마트폰 사이즈: " + sp.size);
		System.out.println("스마트폰 볼륨: " + sp.volume);
		
		
		sp.color = "GOLD";
		sp.size = 6.0f;
		
		System.out.println();
		System.out.println("스마트폰 색상: " + sp.color);
		System.out.println("스마트폰 사이즈: " + sp.size);		
		
		// 인스턴스 메소드 호출: 참조변수.메소드이름();
		
		System.out.println();
		sp.call();
		
		// 볼륨값 변경
		// 변수에 직접 대입하거나 (x)
		// 메소드를 통해서 변경
		System.out.println("현재 볼륨: " + sp.volume);
		sp.volumeUp();
		sp.volumeUp();
		sp.volumeUp();
		System.out.println("현재 볼륨: " + sp.volume);
		sp.volumeDown();
		System.out.println("현재 볼륨: " + sp.volume);
		
	}
	
}

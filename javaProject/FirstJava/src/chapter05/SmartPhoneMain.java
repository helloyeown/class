package chapter05;

public class SmartPhoneMain {

	public static void main(String[] args) {
		
		// SmartPhone 클래스의 인스턴스를 만들어서 프로그램을 완성
		// 새로운 스마트폰 객체를 하나 더 만듬
		SmartPhone sp1 = new SmartPhone();
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		
		SmartPhone sp2 = new SmartPhone();
		sp2.color = "red";
		sp2.size = 4.0f;
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
		
		
		System.out.println();
		sp1 = sp2;	//sp2의 주소값을 sp1에 저장
		//sp1이 sp2가 가리키는 주소를 같이 가리키게 됨
		System.out.println(sp1.color);
		System.out.println(sp1.size);
		System.out.println(sp2.color);
		System.out.println(sp2.size);
		
	}
}

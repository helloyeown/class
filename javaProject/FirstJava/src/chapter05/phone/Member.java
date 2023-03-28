package chapter05.phone;

public class Member {

	// 변수
	String name;
	String email;
	int age;
	String phoneNumber;
	SmartPhone phone;	//참조형 변수 선언(주소값), 객체를 가진다
	
	public Member(String name, String email, int age, String phoneNumber, SmartPhone phone) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.phone = phone;
	}

	public Member(String name, String email) {
		this.name = name;
		this.email = email;
		this.age = 20;
		this.phoneNumber = "입력 데이터가 없습니다";
		this.phone = new SmartPhone();
		// phone이 가리키는 값이 null이기 때문에 객체 생성
	}
	
	void showData() {
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		System.out.println("나이: " + age);
		System.out.println("전화번호: " + phoneNumber);
		this.phone.call();
	}
	
}

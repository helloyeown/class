package chapter05.phone;

public class Member {

	// 변수
	String name;
	String email;
	int age;
	String phoneNumber;
	
	public Member(String name, String email, int age, String phoneNumber) {
		this.name = name;
		this.email = email;
		this.age = age;
		this.phoneNumber = phoneNumber;
	}

	public Member(String name, String email) {
		this.name = name;
		this.email = email;
		this.age = 20;
		this.phoneNumber = "입력 데이터가 없습니다";
	}
	
	void showData() {
		System.out.println("이름: " + name);
		System.out.println("이메일: " + email);
		System.out.println("나이: " + age);
		System.out.println("전화번호: " + phoneNumber);
	}
	
}

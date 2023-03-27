package chapter05;

public class InstanceVariable {

	String name = "KING";	
	int age = 12;
	
	void tellName() {
		System.out.println("나의 이름은 " + name + "입니다");
		System.out.println("나의 이름은 " + ClassVariable.name + "입니다");
		// ClassVariable 클래스의 스태틱 변수 name 참조
	}
	
	void tellAge() {
		System.out.println("나이는 " + age + "살입니다");
	}
	
	
	
	public static void main(String[] args) {
		
		//인스턴스 변수는 인스턴스를 생성했을 때 생성, 인스턴스가 소멸될 때 소멸
		
		InstanceVariable iv = new InstanceVariable();
		
		System.out.println(iv.name);
		System.out.println(iv.age);

		iv.tellName();
		iv.tellAge();
		
	}
	
}

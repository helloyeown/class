package chapter05;

public class ModifierPrivate {

	private String name;	//private
	private int age;		//같은 클래스 내에서만 접근 가능

	public ModifierPrivate(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	// 은닉된 변수들은 정해진 메소드를 통해서 액세스, 설정
	// Getter/Setter
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	
	void tell() {		//(default)
		System.out.println("안녕하세요. " + age + "살 " + name + "입니다.");
	}
}

package person;

public class Male extends Person {
	
//	② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//	③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
//	④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다
	
	String email;

	public Male(String name, String id, String email) {
		super(name, id);
		this.email = email;
	}

	@Override
	public void sayHi() {
		super.sayHi();
		System.out.println("메일 주소는 " + email + "입니다.");
	}
	
	

	
	
}

package PersonSolve;

public class Male extends Person {
	
//	② 각 클래스는 상속 받은 멤버 외에 추가적인 변수와 메소드를 추가해서 새로운 클래스를 정의해봅시다.
//	③ Person 클래스에서 정의된 인사하는 메소드를 오버라이딩 해봅시다.
//	④ Person 클래스에 생성자를 정의해서 인스턴스 변수들을 초기화 해봅시다.

	private String msg;
	
	
	public Male(String name, String personNum, String msg) {
		super(name, personNum);
		this.msg = msg;
	}
	

	@Override
	public void printGreeting() {
		super.printGreeting();
		System.out.println(msg);
	}
	
	
	void hello() {
		System.out.println("안녕하세요.");
	}

}

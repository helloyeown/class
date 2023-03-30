package person;

public class PersonMain {

	public static void main(String[] args) {
//		① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
//		② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다.
		
		Female f = new Female("예원", 29, "서울");
		Male m = new Male("손흥민", 30, "son@gmail");
		
		f.sayHi();
		m.sayHi();
	}

}

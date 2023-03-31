package PersonSolve;

public class PersonMain {

	public static void main(String[] args) {
		
//		① Person 클래스를 상속받은 Male클래스와 Female클래스를 이용해서 인스턴스를 생성해 봅시다.
//		② 생성된 인스턴스들을 이용해서 메소드를 호출해봅시다
		
		Male m1 = new Male("손흥민", "001111-1000000", "축구선수입니다.");
		m1.printGreeting();
		
		Person p1 = m1;
		p1.printGreeting();
//		p1.hello();		// 오류
		
		Person p2 = new Female("예원", "950808-2000000");
		p2.printGreeting();
		
	}
}
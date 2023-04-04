package api;

public class Person {

	String name;
	String personNumber;
	
	public Person(String name, String personNumber) {
		super();
		this.name = name;
		this.personNumber = personNumber;
	}
	
	
	// equals() 메소드를 오버라이딩해서 주민등록번호가 같으면 같은 인스턴스로 판별
	@Override
	public boolean equals(Object obj) {
		
		boolean result = false;
		
		// 매개변수로 전달 받은 obj를 Person 타입으로 형변환
		// (null이 아닌 상태에서 형변환 가능 여부 체크)
		// -> personNumber 비교 -> 결과값 result에 대입
		if(obj!=null && obj instanceof Person) {
			Person p = (Person)obj;
			result = this.personNumber.equals(p.personNumber);
		}
		
		return result;
	}

	
	public static void main(String[] args) {

		Person p1 = new Person("예원", "950808-2000000");
		Person p2 = new Person("예원2", "950808-2000000");
		System.out.println(p1.equals(p2));
		
	}

}

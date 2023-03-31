package person;

public class Person {

//	① 이름을 저장하는 변수, 주민등록번호를 저장하는 변수를 정의해봅시다.
//	② 인사하는 메소드를 정의해봅시다.
//	- “안녕하세요. 저는 OOO입니다. 00살 입니다.”라는 문자열이 출력하도록 정의합시다
	
	private String name;
	private String id;
	
	
	public Person(String name, String id) {
		super();
		this.name = name;
		this.id = id;
	}

	public int getAge() {
		int age = 0;
		
		String year = id.substring(0, 2);
		char gender = id.charAt(7);
		
		if(gender < '3') {
			age = 2023 - (1900 + Integer.parseInt(year)) + 1;
		} else {
			age = 2023 - 2000 - Integer.parseInt(year) + 1;
		}
		
		return age;
	}
	

	public void sayHi() {
		System.out.println("안녕하세요. 저는 " + name + "입니다. " + getAge() + "살입니다.");
	}
	
}
package first;

public class Member {

	public static void main(String[] args) {

//		변수 선언: 메모리 할당, 저장, 이름으로 참조
		String name;	//변수선언
		name = "문예원";	//변수초기화
		
		int age=29;		//변수 선언+초기화
		double height=156.5;
		boolean hasBook=true;

		System.out.println("문예원");
		
		System.out.println("이름: " + name);
		System.out.println("나이: " + age);
		System.out.println("키: " + height);
		System.out.println("책: " + hasBook);
		
	}

}

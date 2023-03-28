package chapter05.phone;

import java.util.Date;

public class MemberMain {
	
	public static void main(String[] args) {

		Date now = new Date();
		
		SmartPhone smartPhone = new SmartPhone();
		
		Member member1 = new Member("문예원", "naver@com", 29, "01000000000", smartPhone);
		Member member2 = new Member("손흥민", "son@mail");
		
		member1.showData();
		System.out.println();
		member2.showData();
		
		dataPrint(member1);
		//매개변수의 인자로 Member 타입의 인스턴스를 가리키는 주소값 전달
		dataPrint(member2);
		
	}
	
	static void dataPrint(Member member) {
		// Member member: 매개변수이면서 참조변수
		// Member member = member1;
		
		member.showData();
	}
	
}

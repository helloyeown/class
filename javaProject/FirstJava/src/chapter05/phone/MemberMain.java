package chapter05.phone;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member1 = new Member("문예원", "naver@com", 29, "01000000000");
		Member member2 = new Member("손흥민", "son@mail");
		
		member1.showData();
		System.out.println();
		member2.showData();
		
	}
}

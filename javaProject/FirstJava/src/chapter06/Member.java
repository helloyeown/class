package chapter06;

public class Member {

	int memberNo;
	String memberId;
	String memberName;

	public Member(int memberNo, String memberId, String memberName) {
		this.memberNo = memberNo;
		this.memberId = memberId;
		this.memberName = memberName;
	}

	@Override	// 오버라이딩의 조건에 맞는지 체크해줌
	// 부모에게 상속받은 메소드를 고쳐씀
	// 선언부는 같고 구현부가 다름
	public String toString() {
		return "회원 [회원번호=" + memberNo + ", 아이디=" + memberId + ", 이름=" + memberName + "]";
	}
	
	

}
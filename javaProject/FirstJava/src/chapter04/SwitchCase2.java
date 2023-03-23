package chapter04;

public class SwitchCase2 {

	public static void main(String[] args) {
		
		// 사용자 권한 
		// 일반 유저: 읽기
		// 매니저: 읽기, 쓰기
		// 관리자: 읽기, 쓰기, 삭제
		
		String grade = "admin";	//admin, manager, user
		
		switch(grade) {
		case "admin":
			System.out.println("삭제");
		case "manager":
			System.out.println("쓰기");
		case "user":
			System.out.println("읽기");
		}
		
	}
}

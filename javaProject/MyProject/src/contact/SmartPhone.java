package contact;

import java.util.Scanner;

public class SmartPhone {
	
//	연락처 정보를 관리하는 클래스입니다. 
//	① Contact 클래스의 인스턴스 10개를 저장 할 수 있는 배열을 정의합시다.
//	② 배열에 인스턴스를 저장하고, 수정하고, 삭제, 저장된 데이터의 리스트를 출력하는 메소드를 정의합니다.
	
	
	public void save(Contact[] arr) {
		System.out.println("연락처가 저장되었습니다.");
	}
	
	public void edit(Contact[] arr) {
		System.out.println("수정되었습니다");
	}
	
	public void delete(Contact[] arr) {
		System.out.println("삭제되었습니다.");
	}

	@Override
	public String toString() {
		return "SmartPhone [toString()=" + super.toString() + "]";
	}

	
	
	public static void main(String[] args) {
		
//		① SmartPhone 클래스의 인스턴스를 생성합니다.
//		② 사용자로부터 입력을 받아 Contact 인스턴스를 생성해서 SmartPhone 클래스의 인스턴스가 가지고 있는 배열에 추가합니다.
//		③ 10번 반복해서 배열에 추가합니다.
//		④ 배열의 모든 요소를 출력합니다.
//		⑤ 배열의 모든 요소를 검색합니다.
//		⑥ 배열의 요소를 삭제해 봅시다.
//		⑦ 배열의 요소를 수정해 봅시다
		
		
		SmartPhone sp = new SmartPhone();
		
		Scanner in = new Scanner(System.in);
		
		
		
		
		
		
		
		
		Contact[] c = new Contact[10];
//		
//		c[0] = new Contact("예원1", "0101234");
//		c[1] = new Contact("예원1", "0101234");
//		c[2] = new Contact("예원1", "0101234");
//		c[3] = new Contact("예원1", "0101234");
//		c[4] = new Contact("예원1", "0101234");
//		c[5] = new Contact("예원1", "0101234");
//		c[6] = new Contact("예원1", "0101234");
//		c[7] = new Contact("예원1", "0101234");
//		c[8] = new Contact("예원1", "0101234");
//		c[9] = new Contact("예원1", "0101234");
		
		
		
	}

}

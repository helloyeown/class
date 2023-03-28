package exam;

import java.util.Scanner;

public class ContactMain {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
//		c1.getAdress();
//		c1.getBirth();
//		c1.getEmail();
//		c1.getGroup();
//		c1.getName();
//		c1.getPhoneNumber();
//		c1.print();
//		
//		System.out.println();
//		
//		c1.setAdress("동대문구");
//		c1.setBirth("0808");
//		c1.setEmail("yewon@gamil");
//		c1.setGroup("친구");
//		c1.setName("문예원");
//		c1.setPhoneNumber("01000000000");
//		c1.print();
//		
//		System.out.println();
		
		System.out.print("이름을 입력하세요.>>");
		String name = in.nextLine();
		System.out.print("전화번호를 입력하세요.>>");
		String phoneNumber = in.nextLine();
		System.out.print("메일을 입력하세요.>>");
		String email = in.nextLine();
		System.out.print("주소를 입력하세요.>>");
		String adress = in.nextLine();
		System.out.print("생일을 입력하세요.>>");
		String birth = in.nextLine();
		System.out.print("그룹을 입력하세요.>>");
		String group = in.nextLine();
		
		System.out.println();
		
		Contact c1 = new Contact(name, phoneNumber, email, adress, birth, group);
		c1.print();
		
	}
}

package contact;

public class ContactMain {
	
	public static void main(String[] args) {


	Contact c = new Contact(
			"문예원", 
			"01000000000", 
			"yewon@gmail", 
			"동대문구", 
			"0808",
			"친구");
	
	
	System.out.println("이름: " + c.getName());
	System.out.println("전화번호: " + c.getPhoneNumber());
	System.out.println("메일: " + c.getEmail());
	System.out.println("주소: " + c.getAddress());
	System.out.println("생일: " + c.getBirthday());
	System.out.println("그룹: " + c.getGroup());
	
	System.out.println("---------------------");
	c.printData();
	
	
	c.setPhoneNumber("01012345678");
	c.setEmail("yewon@gmail");
	c.setAddress("서울");
	c.setBirthday("1990.03.01");
	
	System.out.println("---------------------");
	c.printData();
	
	}
}

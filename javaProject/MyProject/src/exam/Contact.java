package exam;

public class Contact {

	//	이름 전화번호 이메일 주소 생일 그룹
	//	출력하는 기능
	private String name;
	private String phoneNumber;
	private String email;
	private String adress;
	private String birth;
	private String group;
	
	public Contact() {}
	
	public Contact(String name, String phoneNumber, String email, String adress, String birth, String group) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.adress = adress;
		this.birth = birth;
		this.group = group;
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAdress() {
		return adress;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	public String getGroup() {
		return group;
	}

	public void setGroup(String group) {
		this.group = group;
	}



	public void print() {
		System.out.println("이름: " + name);
		System.out.println("전화번호: " + phoneNumber);
		System.out.println("메일: " + email);
		System.out.println("주소: " + adress);
		System.out.println("생일: " + birth);
		System.out.println("그룹: " + group);
	}

}

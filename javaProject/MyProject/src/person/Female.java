package person;

public class Female extends Person {
	
	String address;



	public Female(String name, int age, String address) {
		super(name, age);
		this.address = address;
	}



	@Override
	public void sayHi() {
		super.sayHi();
		System.out.println("주소는 " + address + "입니다.");
	}
	

}

package person;

public class Female extends Person {
	
	String address;



	public Female(String name, String id, String address) {
		super(name, id);
		this.address = address;
	}



	@Override
	public void sayHi() {
		super.sayHi();
		System.out.println("주소는 " + address + "입니다.");
	}
	

}

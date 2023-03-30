package chapter07;

public class Parent {
	int num = 10;
	
	public static void main(String[] args) {
		
		Child c = new Child();
		
		c.showData(1000);
		
	}
}

class Child extends Parent {
	int num = 100;

	void showData(int num) {
		System.out.println("상위 클래스의 num: " + super.num);
		System.out.println("하위 클래스의 num: " + this.num);
		System.out.println("지역변수 num: " + num);
	}
}
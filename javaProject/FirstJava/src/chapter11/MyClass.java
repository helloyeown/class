package chapter11;

public class MyClass<T> {
	// <T>: 타입 파라미터, 매개변수화 된 데이터 타입

	// 변수타입, 메소드 반환 타입, 매개변수 타입
	T val;
	
	public MyClass(T val) {	// 생성자
		super();
		this.val = val;
	}
	
	public MyClass() {}		// 기본생성자

	T getVal() {
		return val;
	}
	
	void setVal(T val) {
		this.val = val;
	}
	
	
	public static void main(String[] args) {
		
		MyClass<String> myClass = new MyClass<String>();
		// 위의 T 타입으로 지정한 모든 멤버들이 String 타입으로 생성됨
		myClass.setVal("KING");	// String 타입의 데이터만 전달 가능
//		myClass.setVal(new Date());	// 잘못된 타입이 저장되지 않도록 처리
		System.out.println(myClass.getVal());	// String 타입의 데이터만 반환
	}
}

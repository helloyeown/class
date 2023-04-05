package chapter11;

public class MyInterfaceImpl<T1, T2> implements MyInterface<T1, T2> {

	@Override
	public T1 method1(T1 t) {
		return t;
	}

	@Override
	public T2 method2(T2 t) {
		return t;
	}
	
	
	public static void main(String[] args) {
		
		MyInterfaceImpl<String, Integer> my = null;
		// Integer: Wrapper class (int(기본형)->Integer(참조형))
		my = new MyInterfaceImpl();	// <String, Integer> 생략 가능
		
		System.out.println(my.method1("Ten"));
		System.out.println(my.method2(10));
		
	}
}

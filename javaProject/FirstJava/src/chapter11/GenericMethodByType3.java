package chapter11;

import chapter08.phone.Phone;
import chapter08.phone.SmartPhone;

public class GenericMethodByType3 {

	public void introduce(MyClass<? super SmartPhone> t) {
		// Phone을 구현한 SmartPhone
		// SmartPhone의 조상만 올 수 있음
		System.out.println("안녕하세요. " + t.toString());
	}
	
	
	public static void main(String[] args) {
		
		GenericMethodByType3 byType = new GenericMethodByType3();
		
		MyClass<Phone> class1 = new MyClass<Phone>();
		class1.setVal(new SmartPhone());
		
//		byType.<String>introduce("1");
		byType.introduce(class1);
		
	}
}
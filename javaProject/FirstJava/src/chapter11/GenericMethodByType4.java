package chapter11;

import chapter08.phone.Phone;
import chapter08.phone.SmartPhone;

public class GenericMethodByType4 {

	public void introduce(MyClass<? super SmartPhone> t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	
	public static void main(String[] args) {
		
		GenericMethodByType4 type = new GenericMethodByType4();
		MyClass<Phone> class1 = new MyClass<Phone>();
		
		class1.setVal(new SmartPhone());
		type.introduce(class1);
		
	}
}
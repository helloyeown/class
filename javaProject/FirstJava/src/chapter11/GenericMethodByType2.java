package chapter11;

import chapter08.Phone;
import chapter08.SmartPhone;

public class GenericMethodByType2 {

	public <T extends Phone> void introduce(T t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	
	public static void main(String[] args) {
		
		GenericMethodByType2 byType = new GenericMethodByType2();
		
		SmartPhone p = new SmartPhone("010-1111-2222", "IOS");
		
//		byType.<String>introduce("1");
		byType.<SmartPhone>introduce(p);
		byType.introduce(p);	// 생략 가능, SmartPhone 타입만 가능
		
	}
}

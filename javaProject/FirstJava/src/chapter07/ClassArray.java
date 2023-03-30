package chapter07;

public class ClassArray {

	public static void main(String[] args) {
		
		// 상위 타입의 배열 인스턴스 생성
		Phone[] phones = new Phone[5];
		
		// phones: Phone 타입의 참조변수로 하위 타입(안드로이드, 아이폰) 참조
		phones[0] = new AndroidPhone("010-1234-5678");
		phones[1] = new IPhone("010-1111-2222");
		phones[2] = new IPhone("010-2222-3333");
		phones[3] = new AndroidPhone("010-3333-4444");
		phones[4] = new AndroidPhone("010-4444-5555");
		
		for(Phone phone : phones) {
			phone.call();
		}
	}
}
package chapter07;

public class ClassCasting1 {

	public static void main(String[] args) {
		
		AndroidPhone androidPhone = new AndroidPhone("01011112222");
		
		Phone phone = new AndroidPhone("11");
		Phone p = new IPhone("222");
		
		Phone phone1 = (Phone)androidPhone;
		Phone phone2 = androidPhone;	// 하위 타입->상위 타입 형변환 생략 가능
		
		AndroidPhone phone3 = (AndroidPhone)phone;	// 생략 불가능
		
//		AndroidPhone phone4 = (AndroidPhone)p;		// 오류
		
		IPhone iPhone = null;
		AndroidPhone androidPhone2 = null;
		
		if(p instanceof IPhone) {
			iPhone = (IPhone)p;
			iPhone.call();
		} else if(p instanceof AndroidPhone) {
			androidPhone2 = (AndroidPhone)p;
			androidPhone2.call();
		}
	}
}

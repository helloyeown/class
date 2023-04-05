package chapter11;

public class GenericMethodByType {

	public <T> void introduce(T t) {
		System.out.println("안녕하세요. " + t.toString());
	}
	
	
	public static void main(String[] args) {
		
		GenericMethodByType byType = new GenericMethodByType();
		
		byType.<String>introduce("1");	// String 타입만 들어올 수 있음
		byType.<Integer>introduce(1);	// Integer 타입만 들어올 수 있음
		byType.introduce("1");			// 어떤 타입이든 가능 (범용)
		byType.introduce(true);
		
	}
}
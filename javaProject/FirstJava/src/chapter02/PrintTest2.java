package chapter02;

public class PrintTest2 {

	public static void main(String[] args) {
		
		String name = "문예원";
		
		// 안녕하세요 저는 ㅇㅇㅇ입니다. 나이는 ㅇㅇ살입니다.
		System.out.print("안녕하세요 저는 ");
		System.out.print(name);
		System.out.print("입니다.");
		
		System.out.println();
		System.out.printf("안녕하세요 저는 %s입니다. 나이는 %d살입니다.", name, 20);
		
		System.out.println();
		System.out.printf("정수:%d, 실수:%f, ", 10, 13.5);
		System.out.printf("문자:%c, 문자열:%s", 'Z', "KING");
		
	}

}
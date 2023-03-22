package chapter03;

public class Operator10 {

	public static void main(String[] args) {
		
		String str1 = "JAVA";
		String str2 = "programming";
		
		// str1, str2는 참조변수(객체를 가리키는 메모리 주소값 저장)
		// 참조변수의 관계연산은 ==, != 만 가능
		System.out.println(str1 == str2);
		System.out.println(str1 != str2);
		
//		System.out.println(str1 > str2);  	//오류
		
	}
}

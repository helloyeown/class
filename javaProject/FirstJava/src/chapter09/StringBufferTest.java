package chapter09;

public class StringBufferTest {

	public static void main(String[] args) {
		
		// capacity() : 저장공간 사이즈 반환
		StringBuffer sb1 = new StringBuffer();	// 문자열 생성
		System.out.println(sb1.capacity());	// 16
		
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);
		System.out.println(sb.capacity());	// 21(16+5)
		
		// append
		// sb.append('~');	// "Hello~"
		// sb.append(" JAVA");	// "Hello~ JAVA"
		sb.append('~').append(" JAVA");	// 체이닝
		System.out.println(sb);	// "Hello~ JAVA"
		
		// delete()
		sb.delete(5, 7);	// 5~(7-1)
		System.out.println(sb);		//HelloJAVA
		
		// insert() : 중간에 데이터 넣기
		sb.insert(5, '~');
		System.out.println(sb);		//Hello~JAVA
		sb.insert(6, "~! ");
		System.out.println(sb);
		sb.insert(sb.length(), false); 	// append랑 같음(뒤에 붙이기)
		System.out.println(sb);		// Hello~~! JAVAfalse
		
		// reverse() : 저장된 위치 반전
		sb.reverse();
		System.out.println(sb);		// eslafAVAJ !~~olleH
		
		String result = new String(sb);	// 변경 불가하게 됨(->String)
		System.out.println(result);
		
	}
}
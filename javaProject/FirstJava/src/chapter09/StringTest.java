package chapter09;

public class StringTest {

	public static void main(String[] args) {
		
		String str1 = "String";
		String str2 = "String";
		String str3 = new String("String");	// 별도의 새로운 객체 생성
		
		// 참조변수로 주소값 비교
		System.out.println(str1==str2);		// true
		System.out.println(str1==str3);		// false
		
		// equals로 문자열 내용 비교
		System.out.println("str1.equals(str3) -> " + str1.equals(str3));
	
		// 특정 타입의 데이터를 String 타입(문자열)으로 변경
		String str4 = ""+1;
		String str5 = String.valueOf(1);
		String str6 = new String();
		System.out.println(str5.toString());
		
		String str = "Hello";
		System.out.println(str.charAt(0));
		System.out.println(str.charAt(4));
		System.out.println(str.length());	// 문자의 갯수
		// index : 0 ~ str.length()-1
		
		// 반복문으로 문자열 출력
		for(int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i) + " ");
		}
		
		System.out.println();
		
		// 역순으로 출력
		for(int i=str.length()-1; i>=0; i--) {
			System.out.println(str.charAt(i) + " ");
		}
		
		System.out.println("================");
		
		// compareTo : 크고 작음을 판단
		// 1. 원본과의 문자열(int 유니코드) 비교 
		// 2. 차이가 없으면 index 길이 차이 비교
		// 3. 둘 다 차이가 없으면 0 반환
		System.out.println(str.compareTo("Hello"));
		System.out.println(str.compareTo("Hello~"));
		System.out.println(str.compareTo("Hell"));
		
		System.out.println();
		
		// 문자열을 붙인다 : "" + "" -> concat
		System.out.println(str.concat(" JAVA"));
		
		System.out.println();
		
		// contains : 특정 문자열 포함 여부를 확인하는 메소드 (boolean)
		System.out.println(str.contains("lo"));
		System.out.println(str.contains("fine"));
		
		// endsWith(), startsWith()
		// substring()
		String file1 = "phone.jpg";
		String file2 = "java.pdf";
		
		String url = "http://localhost:80/member/login.jsp";
		System.out.println(url.startsWith("http://"));
		String domain = "http://localhost:80/";
		
		System.out.println(url.substring(domain.length()));
		
		
		if(file1.endsWith(".jpg") || file2.endsWith(".png")) {
			System.out.println("업로드가 가능합니다.");
		} else {
			System.out.println("jpg 확장자만 업로드가 가능합니다.");
		}
		
		// equals() : 저장하고 있는 문자열 내용을 비교
		System.out.println(str.equals("Hello"));
		System.out.println(str.equals("Hello~"));
		
		// 문자열의 사이즈 체크 : isEmpty() -> str.length() == 0
		System.out.println(str.isEmpty());
		System.out.println("".isEmpty());
		
		// 문자열의 갯수
		System.out.println(str.length());
		System.out.println("hi".length());
		
		// replace() : 문자열 치환
		System.out.println(str);
		System.out.println(str.replace('l', 'y'));
		System.out.println(str.replace("Hello", "JAVA"));
		
		// trim() : 공백 제거
		String str7 = "     Hello   Java     ";
		System.out.println(str7);
		System.out.println(str7.trim());	// Hello   Java
	}
}
package chapter02;

public class VarCharType {

	public static void main(String[] args) {

		char ch1 = 'A';
		System.out.println(ch1);
		
		int number = ch1 + 0;	//2byte->4byte (int로 형변환)
		System.out.println(number);

		char ch2 = 65;
		System.out.println(ch2);
		
	}

}

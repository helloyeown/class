package chapter02;

public class ByteOverflow {

	public static void main(String[] args) {

		// 다루어야 하는 데이터의 범위에 따라 타입 설정이 달라져야 한다
		//0~270
		
		byte b = 0;
		int i = 0;
		
		// 0에서 1씩 더해서 270까지 증가
		//for(초기식; 조건식; 증감식) {반복되는 코드들}
		for(int x=0; x<=270; x++) {		//x 초기값 0, 조건식이 참일 때까지 x에 1씩 더하며 코드 반복
//			System.out.println(x);
//			b = b + 1;
			
			System.out.println(b + "\t" + i);
			b++;
			i++;			
		}
		
	}

}

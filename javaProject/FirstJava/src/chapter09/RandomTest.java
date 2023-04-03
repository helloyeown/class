package chapter09;

public class RandomTest {

	public static void main(String[] args) {

		// 특정 범위의 난수 추출
//		int num = (int)(Math.random()*10)+1;
		// 0 ~ 0.999... -> 0~9.99... -> 0~9 -> 1~10
//		System.out.println(num);

		for(int i=0; i<6; i++) {
			int num = (int)(Math.random()*45)+1;
			System.out.println(num);
		}

	}
}

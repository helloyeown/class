package quiz;

public class Quiz11 {

	public static void main(String[] args) {

		//		while 문을 for 문으로 변경

		int count=0;
		
		for(int num=1; num<100; num++) {
			if(num%5!=0 || num%7!=0)	//5의 배수가 아니거나 7의 배수가 아니라면 건너뜀
				continue;
			count++;	//5, 7의 배수라면 카운트됨
			System.out.println(num);	//5,7의 배수라면 출력됨
		}
		System.out.println("count: " + count);
		
		
		
		
		
//		while((num++)<100){		//0~99
//			if(num%5!=0 || num%7!=0)	//5의 배수가 아니거나 7의 배수가 아니라면 건너뜀
//				continue;
//			count++;	//5, 7의 배수라면 카운트됨
//			System.out.println(num);	//5,7의 배수라면 출력됨
//		}
//		System.out.println("count: " + count);



	}
}

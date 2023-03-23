package chapter04;

public class WhileLoop2 {

	public static void main(String[] args) {
		
		int num = 1;
		
		while(num<10) {		//행 표현
			
			int n = 2;
			
			while(n<10) {	//열 표현
				System.out.print(n + "*" + num + "= " + n*num  + "  \t");
				n++;
			}
			
//			System.out.println("2*" + num + "=" + num*2);
			
//			System.out.print("2*" + num + "=" + num*2);
//			System.out.print("\t 3*" + num + "=" + num*3);
//			System.out.print("\t 4*" + num + "=" + num*4);
			
			System.out.println();
			num++;
		}
		
		
		
		
	}
}

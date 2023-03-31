package calculatoer;

public class CalculatorMain {

	public static void main(String[] args) {
//		다형성의 특징으로 상위 타입인 인터페이스 타입의 참조변수에 
//		인터페이스를 구현한 클래스 타입의 인스턴스를 참조하는 코드를 작성해 봅시다
		
		Calculator c = new CalculatorImpl();
		System.out.println(c.add(1, 1));
		System.out.println(c.substract(5, 3));
		System.out.println(c.multiply(6, 2));
		System.out.println(c.divide(8, 2));
	}

}

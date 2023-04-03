package CalculatorSolve;

public class CalculatorImpl implements Calculator {

	@Override
	public long add(long n1, long n2) {
		return n1+n2;
	}

	@Override
	public long sub(long n1, long n2) {
		return n1-n2;
	}

	@Override
	public long mul(long n1, long n2) {
		return n1*n2;
	}

	@Override
	public double div(double n1, double n2) {
		return n1/n2;
	}

	
	public static void main(String[] args) {
		
		Calculator cal = new CalculatorImpl();
		// 인터페이스 구현 -> 다형성
		// 다형성 가능 -> 메소드의 매개변수로 선언, 인터페이스 타입의 배열
		System.out.println(cal.add(10, 5));
		
	}
}


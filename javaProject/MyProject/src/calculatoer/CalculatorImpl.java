package calculatoer;

public class CalculatorImpl extends CalculatorAbstract implements Calculator {

	@Override
	public long multiply(long n1, long n2) {
		return n1*n2;
	}

	@Override
	public double divide(double n1, double n2) {
		return n1/n2;
	}

}

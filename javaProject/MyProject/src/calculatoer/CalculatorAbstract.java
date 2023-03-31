package calculatoer;

public abstract class CalculatorAbstract implements Calculator {

	@Override
	public long add(long n1, long n2) {
		return n1+n2;
	}

	@Override
	public long substract(long n1, long n2) {
		return n1-n2;
	}

	@Override
	public abstract long multiply(long n1, long n2);

	@Override
	public abstract double divide(double n1, double n2);

}

package chapter7.test;

class Product{
	
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price = price;
		bonusPoint = (int)(price/10.0);
	}

	public Product() {}
	
	
}

class Tv extends Product{

	public Tv() {}

	public String toString() {
		return "TV";
	}
	
}

public class Ex7_3 {

	public static void main(String[] args) {
		Tv t = new Tv();
	}
	
}

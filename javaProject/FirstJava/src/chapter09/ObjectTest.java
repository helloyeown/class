package chapter09;

public class ObjectTest extends Object {

	public static void main(String[] args) {

	Car c1 = new Car("2023A001");
	Car c2 = new Car("2023B001");
	Car c3 = c1;	// c1 객체의 주소값 넘겨줌
	Car c4 = new Car("2023A001");
	
	
	System.out.println(c1.toString());	// 오버라이딩 전: 객체 주소 출력
	System.out.println(c2.toString());
	
	System.out.println(c1.equals(c2));	// 오버라이딩 전: 참조값 비교
	System.out.println(c1.equals(c3));
	System.out.println(c1.equals(c4));
	System.out.println(c1.equals(null));
	System.out.println(c1.equals("2023A001"));
	
	}
}

class Car{

	String carNo;
	Car(String carNo){
		this.carNo = carNo;
	}
	
	@Override
	public boolean equals(Object obj) {
		// 객체 단위의 비교
		
		// obj -> null -> false
		// obj -> Car 타입으로 형변환 가능해야 함
		Car car = null;
		if(obj!=null && obj instanceof Car) {
			// obj -> 형변환하고 carNo를 비교해서 결과값 반환
			car = (Car)obj;
			// 문자열을 비교해서 같은지 여부 반환
			if(carNo.equals(car.carNo)) {
				return true;
			}
		}
		
		return false;
	}

	@Override
	public String toString() {
		return carNo+" 차량입니다.";
	}
}
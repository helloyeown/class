package chapter05;

public class ClassVariableMain {

	public static void main(String[] args) {
		
		System.out.println(ClassVariable.name);		// static 변수는 객체 생성 불필요
		System.out.println(ClassVariable.age);
	
		ClassVariable cv = new ClassVariable();
		cv.tellName();
		cv.tellAge();
		
	}
	
}

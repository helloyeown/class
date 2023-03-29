package array;

public class ArrayExam2 {
	public static void main(String[] args) {

		// Student 타입의 배열 생성 (데이터 10개 사이즈)
		Student[] students = new Student[10];
		students[0] = new Student("예원01", 100, 100, 100);
		students[1] = new Student("예원02", 50, 90, 80);
		students[2] = new Student("예원03", 60, 70, 50);
		students[3] = new Student("예원04", 80, 100, 70);
		students[4] = new Student("예원05", 70, 100, 80);
		students[5] = new Student("예원06", 100, 80, 100);
		students[6] = new Student("예원07", 80, 100, 100);
		students[7] = new Student("예원08", 100, 90, 90);
		students[8] = new Student("예원09", 70, 60, 80);
		students[9] = new Student("예원10", 90, 50, 100);

		System.out.println("이름\t국어\t영어\t수학\t총점\t평균");
		System.out.println("==================================================");

		for(Student student:students) {
			System.out.println(student.result());
		}
	}
}
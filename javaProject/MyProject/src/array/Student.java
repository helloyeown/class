package array;

public class Student {

	private String name;
	private int korScore;
	private int engScore;
	private int mathScore;


	public Student(String name, int korScore, int engScore, int mathScore) {
		super();
		this.name = name;
		this.korScore = korScore;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public Student() {}



	// 출력용 게터, 수정용 세터
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKorScore() {
		return korScore;
	}

	public void setKorScore(int korScore) {
		this.korScore = korScore;
	}

	public int getEngScore() {
		return engScore;
	}

	public void setEngScore(int engScore) {
		this.engScore = engScore;
	}

	public int getMathScore() {
		return mathScore;
	}

	public void setMathScore(int mathScore) {
		this.mathScore = mathScore;
	}


	// 총점 계산해서 반환하는 메소드
	private int sum() {
		return korScore + engScore + mathScore;
	}

	private float avg() {
		return sum() / 3f;	//메소드 내에서 메소드 호출
	}


	public String result() {
		return name+"\t"+korScore+"\t"+engScore+"\t"+mathScore+"\t"+sum()+"\t"+avg();
	}



	@Override
	public String toString() {
		//		return "Student [name=" + name + ", korScore=" + korScore + ", engScore=" + engScore + ", mathScore="
		//				+ mathScore + "]";
		//	}
		return result();
	}
}

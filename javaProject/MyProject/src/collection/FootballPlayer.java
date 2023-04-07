package collection;

import java.util.Comparator;
import java.util.Objects;

// 축구선수의 정보를 저장하는 클래스
// : 축구선수 데이터 저장 -> 인스턴스 생성 -> 배열 -> List
public class FootballPlayer implements Comparable<FootballPlayer>{

	private String name;
	private int number;
	private String team;
	private int age;

	public FootballPlayer(String name, int number, String team, int age) {
		this.name = name;
		this.number = number;
		this.team = team;
		this.age = age;
	}

	public FootballPlayer() {
		// 기본생성자
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getTeam() {
		return team;
	}

	public void setTeam(String team) {
		this.team = team;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	
	@Override
	public String toString() {
		return "FootballPlayer [name=" + name + ", number=" + number + ", team=" + team + ", age=" + age + "]";
	}
	
	
	public void showInfo() {
		System.out.printf("[%s] %s(%d), %d\n", this.team, this.name, this.number, this.age);
	}
	
	
	
	
//	@Override
//	public int hashCode() {
//		return Objects.hash(name, team, age);
//		// 식별할 값만 넣기
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if(!(obj instanceof FootballPlayer && obj!=null)) return false;
//		FootballPlayer p = (FootballPlayer)obj;
//		return name.equals(p.name) && team.equals(p.team) && age==p.age;
//	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return this.age;
	}

	@Override
	public boolean equals(Object obj) {
		boolean result = false;
		
		if(obj!=null && obj instanceof FootballPlayer) {
			FootballPlayer p = (FootballPlayer)obj;
			result = this.team.equals(p.getTeam()) && this.name.equals(p.getName()) && this.age==p.getAge();
		}
		return result;
	}
	

	@Override
	public int compareTo(FootballPlayer o) {
		int compare = this.team.compareTo(o.getTeam());
		if(compare == 0) {
			compare = this.name.compareTo(o.getName());
			if(compare == 0) {
				compare = this.number - o.getNumber();
//				compare = Integer.compare(this.number, o.getNumber());
			}
		}
		return compare;
	}


	
}

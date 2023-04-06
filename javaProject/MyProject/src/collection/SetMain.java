package collection;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class SetMain {
	

	public static void main(String[] args) {
		
//		축구선수의 인스턴스가 팀과 이름 그리고 나이가 같으면 같은 선수라 판단하고 입력이 되지 않도록 Set<E> 컬렉션을 이용해서 축구선수 인
//		스턴스를 저장하고 출력하는 프로그램을 만들어 봅시다.
		
		HashSet<FootballPlayer> players = new HashSet<>();
		
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		players.add(new FootballPlayer("이강인", 18, "마요르카", 20));
		players.add(new FootballPlayer("박지성", 7, "멘유", 40));
		players.add(new FootballPlayer("박지성", 10, "멘유", 40));
		players.add(new FootballPlayer("손흥민", 8, "토트넘", 30));
		
		for(FootballPlayer player : players) {
			System.out.println(player);
		}
	}
}

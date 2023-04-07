package collection;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetMain {

	public static void main(String[] args) {
		
//		TreeSet<E>을 이용해서 팀 이름순으로 정렬하고, 같은 팀의 선수들은 이름 순으로 정렬하고, 같은 이름의 선수는 번호 순으로 저장하는 프로
//		그램을 만들어 봅시다
		
		Set<FootballPlayer> players = new TreeSet<FootballPlayer>();
		
		players.add(new FootballPlayer("손흥민", 7, "토트넘", 30));
		players.add(new FootballPlayer("이강인", 18, "마요르카", 20));
		players.add(new FootballPlayer("박지성", 7, "멘유", 40));
		players.add(new FootballPlayer("손흥민", 17, "토트넘", 30));
		players.add(new FootballPlayer("루니", 10, "멘유", 40));
		
		for(FootballPlayer player : players) {
			System.out.println(player);
		}
		
	}
}

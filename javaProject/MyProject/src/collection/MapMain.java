package collection;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

	public static void main(String[] args) {
		
//		 축구선수의 번호를 key로 하고 축구선수 인스턴스를 저장하는 Map<K,V> 인스턴스를 이용해서 프로그램을 만들어봅시다.
		
		Map<Integer, FootballPlayer> myTeam = new HashMap<>();
		
		myTeam.put(7, new FootballPlayer("손흥민", 7, "토트넘", 30));
		
		FootballPlayer footballPlayer = myTeam.get(7);
		// key값만 입력해서 찾으면 됨
		System.out.println(footballPlayer);
	}
}
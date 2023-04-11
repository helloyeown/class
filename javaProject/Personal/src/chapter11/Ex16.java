package chapter11;

import java.util.HashMap;
import java.util.Scanner;

public class Ex16 {

	public static void main(String[] args) {
		
		HashMap map = new HashMap<>();
		map.put("myId", "1234");
		map.put("asdf", "1111");
		map.put("asdf", "1234");
		// 이미 존재하는 키를 추가하면 기존 값은 없어짐(덮어쓰기처럼)
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("id와 pw를 입력해주세요. >>");
			System.out.print("id: ");
			String id = sc.nextLine().trim();
			
			System.out.print("pw: ");
			String password = sc.nextLine().trim();
			System.out.println();
			
			if(!map.containsKey(id)) {
				System.out.println("입력하신 id가 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			}
			
			if(!(map.get(id).equals(password))){
				System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
			} else {
				System.out.println("id와 비밀번호가 일치합니다.");
				break;
			}
		}
		
	}
}

package chapter11;

import java.util.HashMap;
import java.util.Set;

public class SmartPhoneHashMapTest {

	public static void main(String[] args) {

		HashMap<String, SmartPhone> hashMap = new HashMap<>();

		SmartPhone p = new SmartPhone("Spring", "010-1111-2222");
		hashMap.put(p.getPhoneNumber(), p);
		
		SmartPhone p2 = new SmartPhone("SON", "010-1111-2222");
		hashMap.put(p2.getPhoneNumber(), p2);
		// Spring->SON  중복X(두개의 키 유지X)
		
		System.out.println(hashMap.get("010-1111-2222"));
		System.out.println(hashMap.get("010-1111-2221"));
		
		System.out.println("===========");
		Set<String> keySet = hashMap.keySet();
		for(String keyName : keySet) {
			System.out.println(keyName + " : " + hashMap.get(keyName));
		}
	}
}
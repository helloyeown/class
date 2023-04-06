package chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex7 {

	public static void main(String[] args) {
		
		String[] strArr = {"cat", "tiger", "Dog", "lion"};
		
		Arrays.sort(strArr);
		System.out.println("strArr= " + Arrays.toString(strArr));
		
		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
		System.out.println("strArr= " + Arrays.toString(strArr));
		
		

//		String[] strArr = {"cat", "tiger", "Dog", "lion"};
//
//		Arrays.sort(strArr);
//		// String의 Comparable 구현에 의한 정렬
//		// 대문자 먼저
//		System.out.println("strArr= " + Arrays.toString(strArr));
//
//		Arrays.sort(strArr, String.CASE_INSENSITIVE_ORDER);
//		// 대소문자 구분 안 함
//		System.out.println("strArr= " + Arrays.toString(strArr));
//
//		Arrays.sort(strArr, new Descending());
//		System.out.println("strArr= " + Arrays.toString(strArr));
//		// 역순 정렬 (사용자 정의)
	}
}

class Descending implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 = (Comparable)o1;
			Comparable c2 = (Comparable)o2;
			return c1.compareTo(c2) * -1;
			// -1을 곱해서 역순 정렬
		}
		return -1;
	}
}
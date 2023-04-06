package chapter11;

import java.util.Arrays;
import java.util.Comparator;

public class Ex8 {

	public static void main(String[] args) {
		
		Integer[] arr = {30,50,10,40,20};
		
		Arrays.sort(arr);
		// Integer의 기본 정렬 기준 compareTo()로 정렬
		System.out.println(Arrays.toString(arr));
		
		Arrays.sort(arr, new DescComp());
		System.out.println(Arrays.toString(arr));
		
	}
}

class DescComp implements Comparator{

	public int compare(Object o1, Object o2) {
		if(!(o1 instanceof Integer && o2 instanceof Integer)) return -1;
		// Integer 타입이 아니면 비교하지 않고 -1 반환
		
		Integer i = (Integer)o1;
		Integer i2 = (Integer)o2;
		
		return i.compareTo(i2) * -1;
		// 기본 정렬인 compareTo()의 역순
	}
	
}

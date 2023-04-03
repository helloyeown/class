package chapter09;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
		// Mon Apr 03 17:42:16 KST 2023
		
		cal.add(Calendar.HOUR, 1);	// 1시간 증가
		System.out.println(cal.getTime());
		
		cal.add(Calendar.DAY_OF_MONTH, 1);	// 하루 증가
		System.out.println(cal.getTime());
		
		Calendar cal2 = Calendar.getInstance();
		Calendar cal3 = Calendar.getInstance();
		
		cal2.set(2023, 3, 1);	// 4월(0부터 시작)
		cal3.set(2023, 5, 1);	// 6월 1일
		
		// before() : 기준 날짜에서 이전인지 판단
		System.out.println(cal.before(cal2));	// false
		System.out.println(cal.before(cal3));	// true
		
		if(cal.before(cal2)) {
			System.out.println("이벤트 진행 중");
		} else {
			System.out.println("이벤트 종료");
		}
		
		System.out.println(cal.get(Calendar.YEAR));
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));	// 위에서 증가시킨 값 반영됨
		System.out.println(cal.get(Calendar.HOUR_OF_DAY));	// 위에서 증가시킨 값 반영됨
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
	}
}

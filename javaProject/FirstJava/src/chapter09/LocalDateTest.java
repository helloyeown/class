package chapter09;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {

	public static void main(String[] args) {
		
		LocalDate now = LocalDate.now();
		System.out.println(now);	// 시스템 현재 날짜
		System.out.println(now.getYear());
		System.out.println(now.getMonthValue());	// 4
		System.out.println(now.getDayOfMonth());
		
		LocalDate nextDay1 = now.plusDays(1);
		System.out.println(nextDay1);
		LocalDate nextDay2 = now.plusMonths(1);
		System.out.println(nextDay2);
		LocalDate nextDay3 = now.plusYears(1);
		System.out.println(nextDay3);
		
		LocalDateTime now2 = LocalDateTime.now();
		System.out.println(now2);
		// 2023-04-03T17:58:54.553090800 (밀리초)
		System.out.println(now2.getHour());		//시
		System.out.println(now2.getMinute());	//분
		System.out.println(now2.getSecond());	//초
		
		
		// 임의의 날짜, 시간 설정
		LocalDate day2 = LocalDate.of(2023, 12, 25);
		System.out.println(day2);
		
		LocalDateTime day3 = LocalDateTime.of(2023, 06, 03, 17, 50, 30);
		System.out.println(day3);
		
		LocalDate day4 = LocalDate.parse("2024-12-25");
		System.out.println(day4);
	}
}
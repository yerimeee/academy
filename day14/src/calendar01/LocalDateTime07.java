package calendar01;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LocalDateTime07 {

	public static void main(String[] args) {
		LocalDateTime today = LocalDateTime.now();
		System.out.println(today);
		
		LocalDateTime startDT = LocalDateTime.of(2023, 02, 8, 9, 30, 01);
		LocalDateTime endDT = LocalDateTime.of(2023, 07, 20, 18, 20, 30);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd a hh:mm:ss");
		//여기선 별도의 클래스와 ofpattern 키워드로 형식 설정
		
		System.out.println("시작일: " + startDT.format(dtf));
		System.out.println("종료일: " + endDT.format(dtf));
		
		if(today.isBefore(endDT)) {
			System.out.println("진행 중입니다.");
		} else if (today.isEqual(endDT)) {	// isEqual 대신에 equals 사용해도 됨
			System.out.println("종료합니다.");
		}else if(today.isAfter(endDT)) {
			System.out.println("종료했습니다.");
		}
		// 날짜만 가능(시간 안 됨)
		LocalDate today2 = LocalDate.now();
		LocalDate endToday = LocalDate.of(2023,07,20);
		Period period = today2.until(endToday);
		System.out.print(period.getMonths() + "개월 " + period.getDays() + "일 남았습니다.");
		System.out.println();
		
		//날짜 시간 모두 가능
		LocalTime endTime = LocalTime.of(18, 20, 30);
		LocalTime now = LocalTime.now();
		System.out.println(now.until(endTime, ChronoUnit.HOURS) + "시간 남았습니다.");
		
		System.out.println(today.until(endDT, ChronoUnit.HOURS) + "시간 남았습니다.");
		System.out.println(today.until(endDT, ChronoUnit.MONTHS) + "개월 남았습니다.");
		System.out.println(today.until(endDT, ChronoUnit.DAYS) + "일 남았습니다.");
		
		//시간만 가능
		Duration duration = Duration.between(now, endTime);
		System.out.println(duration.getSeconds() + "초 남았습니다."); // 나누기 60 하면 분, 또 나누기 60하면 시가 됨.
		
		//모두 가능
		System.out.println(today.plusYears(1).format(dtf)); //오늘 날짜 시간으로부터 1년 후
		System.out.println(today.plusMonths(3).format(dtf)); //오늘 날짜 시간으로부터 3개월 후
		System.out.println(today.plusDays(15).format(dtf));	//오늘 날짜 시간으로부터 15일 후
		System.out.println("---------------------------");
		
		System.out.println(today.minusYears(1).format(dtf)); //오늘 날짜 시간으로부터 1년 전
		System.out.println(today.minusMonths(3).format(dtf)); //오늘 날짜 시간으로부터 3개월 전 
		System.out.println(today.minusDays(15).format(dtf));	//오늘 날짜 시간으로부터 15일 전
	}
}

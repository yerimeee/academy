package calendar01;

import java.time.LocalDate;

public class LocalDate05 {

	public static void main(String[] args) {
		LocalDate today = LocalDate.now();
		System.out.println(today); //toString 안 해도 값 가져올 수 있음
		System.out.println(today.getYear() + "년");
		System.out.println(today.getMonth());
		System.out.println(today.getMonthValue() + "월"); //얘는 달에 대한 +1 안 해줘도 됨
		System.out.println(today.getDayOfMonth() + "일");
		System.out.println("365일 중, " + today.getDayOfYear() + "일째");
		System.out.println(today.getDayOfWeek());
		System.out.println(today.getDayOfWeek().getValue()); //요일을 숫자로 출력
		System.out.println("이 달은 총 " + today.lengthOfMonth() + "일까지 입니다.");
		System.out.println("올해는 총 " + today.lengthOfYear() + "일 입니다.");
		System.out.println("올해는 윤년이 " + today.isLeapYear() + "입니다.");
		
		LocalDate endDay = LocalDate.of(2023, 7, 20); //내가 날짜 설정
		System.out.println(endDay);
	}

}

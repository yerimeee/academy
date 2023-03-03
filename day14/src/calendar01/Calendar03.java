package calendar01;

import java.util.Calendar;

public class Calendar03 {

	public static void main(String[] args) {
		Calendar date1 = Calendar.getInstance();
		date1.set(2022,3,10);
		System.out.println(date1.get(Calendar.YEAR) + "년 " + date1.get(Calendar.MONTH) + "월 " + date1.get(Calendar.DATE) + "일");
		
		date1.add(Calendar.DATE, 100);	//100일 후의 날짜, 전의 날짜를 구하고 싶으면 마이너스 넣기
		System.out.println(date1.get(Calendar.YEAR) + "년 " + date1.get(Calendar.MONTH) + "월 " + date1.get(Calendar.DATE) + "일");
		
		date1.add(Calendar.DATE, -100);	//전의 날짜를 구하고 싶으면 마이너스 넣기
		System.out.println(date1.get(Calendar.YEAR) + "년 " + date1.get(Calendar.MONTH) + "월 " + date1.get(Calendar.DATE) + "일");
		
		//두 달 후
		date1.add(Calendar.MONTH, 2);
		System.out.println(date1.get(Calendar.YEAR) + "년 " + date1.get(Calendar.MONTH) + "월 " + date1.get(Calendar.DATE) + "일");
	}

}

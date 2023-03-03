package calendar01;

import java.util.Calendar;

public class Calendar02 {

	public static void main(String[] args) {
		//배열로 요일 할당하기
		String[] week = {"일","월","화","수","목","금","토"};
		Calendar date1 = Calendar.getInstance();
		System.out.println(date1.get(Calendar.DAY_OF_WEEK));
		System.out.println(week[date1.get(Calendar.DAY_OF_WEEK)-1]);
		
		date1.set(2022, 6, 8); //년월일 내가 설정
		System.out.println(date1.get(Calendar.YEAR) + "년");
		date1.set(2021, 3, 20, 7, 20, 53);	//년월일시분초 설정
		System.out.println(date1.get(Calendar.HOUR) + "시");
		
		//date.set(Calendar.MONTH, 11);
		date1.set(Calendar.MONTH, Calendar.DECEMBER);	//달은 0부터 시작이라 숫자로 넣으면 헷갈려서 보통 이름으로 넣음
		System.out.println((date1.get(Calendar.MONTH)+1) + "월");
		date1.set(Calendar.HOUR_OF_DAY, 15);
		System.out.println(date1.get(Calendar.HOUR_OF_DAY) + "시(24시)");
	}

}

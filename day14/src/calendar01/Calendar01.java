package calendar01;

import java.util.Calendar;

public class Calendar01 {

	public static void main(String[] args) {
		Calendar today = Calendar.getInstance();
		System.out.println("현재 년도: " + today.get(Calendar.YEAR));
		//월은 0이 1월이라 +1 해줘야함
		System.out.println("현재 월: " + (today.get(Calendar.MONTH)+1));
		System.out.println("올해의 몇째 주: " + today.get(Calendar.WEEK_OF_YEAR));
		System.out.println("이 달의 몇째 주: " + today.get(Calendar.WEEK_OF_MONTH));
		
		System.out.println("오늘 일자: " + today.get(Calendar.DATE));
		System.out.println("오늘 일자: " + today.get(Calendar.DAY_OF_MONTH));
		System.out.println("365일 중 몇일째: " + today.get(Calendar.DAY_OF_YEAR));
		
		int week = today.get(Calendar.DAY_OF_WEEK);
		System.out.println("오늘 요일: " + week);
		switch(week) {
		case 1 :
			System.out.println("일요일");
			break;
		case 2 :
			System.out.println("월요일");
			break;
		case 3 :
			System.out.println("화요일");
			break;
		case 4 :
			System.err.println("수요일");
			break;
		case 5 :
			System.out.println("목요일");
			break;
		case 6 :
			System.out.println("금요일");
			break;
		case 7 :
			System.out.println("토요일");
			break;
		}
		
		int time = today.get(Calendar.AM_PM);
		System.out.println("오전(0)_오후(1): " + today.get(Calendar.AM_PM));
		switch(time) {
		case 0 :
			System.out.println("오전");
			break;
		case 1 :
			System.out.println("오후");
			break;
		}
		
		System.out.println("시간(0~11): " + today.get(Calendar.HOUR)); 
		System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY)); 
		System.out.println("분: " + today.get(Calendar.MINUTE));
		System.out.println("초: " + today.get(Calendar.SECOND)); 
		System.out.println("1/1000초: " + today.get(Calendar.MILLISECOND)); 
		
		// 3월 2일 목요일 오후 현재 시 현재 분
		System.out.print((today.get(Calendar.MONTH)+1) + "월 " + today.get(Calendar.DATE) + "일 ");
		
		int week2 = today.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1 :
			System.out.println("일요일");
			break;
		case 2 :
			System.out.println("월요일");
			break;
		case 3 :
			System.out.println("화요일");
			break;
		case 4 :
			System.err.println("수요일");
			break;
		case 5 :
			System.out.println("목요일");
			break;
		case 6 :
			System.out.println("금요일");
			break;
		case 7 :
			System.out.println("토요일");
			break;
		}
		int time2 = today.get(Calendar.AM_PM); 
		switch(time2) {
		case 0 :
			System.out.print("오전 ");
			break;
		case 1 :
			System.out.print("오후 ");
			break;
		}
		System.out.println(today.get(Calendar.HOUR) + "시 " + today.get(Calendar.MINUTE) + "분");
		
	}

}

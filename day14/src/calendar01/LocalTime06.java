package calendar01;

import java.time.LocalTime;

public class LocalTime06 {

	public static void main(String[] args) {
		LocalTime time = LocalTime.now();
		System.out.println(time);
		System.out.println(time.getHour() + "시");
		System.out.println(time.getMinute() + "분");
		System.out.println(time.getSecond() + "초");
		
		LocalTime endTime = LocalTime.of(18, 20, 01);
		System.out.println(endTime);
	}
}

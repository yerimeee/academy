package calendar01;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.TimeZone;

public class Zoned08 {

	public static void main(String[] args) {
		ZonedDateTime seoulDT = ZonedDateTime.now(ZoneId.of("Asia/Seoul"));
		System.out.println(seoulDT);
		
		ZonedDateTime londonDT = ZonedDateTime.now(ZoneId.of("Europe/London"));
		System.out.println(londonDT);
		
		ZonedDateTime BerlinDT = ZonedDateTime.now(ZoneId.of("Europe/Berlin"));
		System.out.println(BerlinDT);
		
		ZonedDateTime newyorkDT = ZonedDateTime.now(ZoneId.of("America/New_York"));
		System.out.println(newyorkDT);
		
		//기준 시간
		ZonedDateTime utc = ZonedDateTime.now(ZoneId.of("UTC"));
		System.out.println(utc);
		
		ZoneOffset seoulOffset = ZoneOffset.of("+09:00");
		System.out.println(ZonedDateTime.now(seoulOffset));
		
		// Calendar 사용 시 이전 버전에서의 활용. 이게 더 많이 쓴대....
		TimeZone timezone = TimeZone.getTimeZone("America/Los_Angeles");
		Calendar now = Calendar.getInstance(timezone);
		System.out.println(now.get(Calendar.HOUR) + "시");
	}
}

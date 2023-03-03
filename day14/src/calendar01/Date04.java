package calendar01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date04 {

	public static void main(String[] args) {
		Date now = new Date();
		System.out.println(now.toString());	//이것보단 밑에 거 더 많이 사용
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm"); //월은 대문자
		System.out.println(sdf.format(now));
		
		SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy-MM-dd HH:mm"); 
		//대문자 HH는 24시간 시. 잘 안 쓰고 위에 거에서 오전/오후 추가해서 씀
		System.out.println(sdf2.format(now));
		
		SimpleDateFormat sdf3 = new SimpleDateFormat("yyyy-MM-dd hh:mm a"); //a 오전오후 추가
		System.out.println(sdf3.format(now));
		
		SimpleDateFormat sdf4 = new SimpleDateFormat("yyyy/MM/dd");
		System.out.println(sdf4.format(now));
		
		SimpleDateFormat sdf5 = new SimpleDateFormat("yy/M/d");
		System.out.println(sdf5.format(now));
		
		SimpleDateFormat sdf6 = new SimpleDateFormat("yy년 MM월 dd일 E요일"); //E 요일 추가
		System.out.println(sdf6.format(now));
	}

}

package aa.bb.cc;

import Phone05.SmartPhone;
import tv.Tv;

public class TvTest {

	public static void main(String[] args) {

		Tv tv = new Tv();
		//tv.channel = 10; private를 했기 때문에 사용 불가
		//tv.channelUp(); public을 안썼기 때문에 사용 불가
		tv.power();
		SmartPhone sp = new SmartPhone();
		sp.kakao("ㅎㅇ");
		sp.internet("접근제어자");
	}

}

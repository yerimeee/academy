package tv03;

public class TvTest {

	public static void main(String[] args) {

		// tv 객체 생성
		Tv tv1 = new Tv();
		tv1.company = "LG";
		tv1.model = "UHD 50인치";
		System.out.println("어느 회사의 tv?: " + tv1.company);
		System.out.println("모델은?: " +  tv1.model);
		
		tv1.power();	// true니까
		tv1.power();	// 한 번 더 호출하면 false됨
		
		tv1.chUp();		//출력문 라이브러리에 넣을 수도 있음.
		tv1.chUp();
		
		tv1.chDown();
		System.out.println("현재 채널은 " +  tv1.ch +  "입니다.");
		
		tv1.volumeUp();
		System.out.println("현재 음량은 " +  tv1.volume + "입니다.");
		
		tv1.power();
		tv1.power();
		
		System.out.println("============================");
		Tv2 tv2 = new Tv2();
		tv2.company = "삼성";
		tv2.model = "4k 30인치";
		System.out.println("어느 회사의 tv?: " + tv2.company);
		System.out.println("모델은?: " +  tv2.model);
		
		tv2.power();
		int volume = tv2.volumeUp();
		System.out.println("현재 음량은 " + volume + "입니다.");
		System.out.println("현재 음량은 " + tv2.volumeUp() + "입니다.");
		
		volume = tv2.volumeDown();
		System.out.println("현재 음량은 " + volume + "입니다.");
		
		tv2.chUp();
		tv2.chUp();
		System.out.println("현재 채널은 " + tv2.chUp() + "입니다.");
		tv2.chDown();
		System.out.println("현재 채널은 " + tv2.chDown() + "입니다.");
		
		System.out.println("============================");
		Tv3 tv3 = new Tv3();
		System.out.println("현재 음량은 " + tv3.volume(20) + "입니다."); //인자(매개변수)를 넣어 내가 원하는 값으로 직접 수정 가능
		System.out.println("현재 음량은 " + tv3.volume(15) + "입니다.");
		System.out.println("현재 음량은 " + tv3.volumeUp(10) + "입니다.");
		System.out.println("현재 음량은 " + tv3.volumeDown(5) + "입니다.");
	}

}

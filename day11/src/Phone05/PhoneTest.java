package Phone05;

public class PhoneTest {	
	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.call();
		sp.massage("안녕");
		sp.video("싸이월드");
		sp.kakao("상태메시지");
		sp.internet("python");
		sp.sound();
		sp.pickUp();
		sp.ansphone();
		sp.pickOut();
		sp.ansphone();
		
		System.out.println("-----------------------");
		
		CellPhone cp = new CellPhone();
		cp.call();
		cp.call();
		cp.massage("스마트폰이 아닙니다");
		cp.video("구버전의 유튜브");
		cp.sound();
		cp.pickUp();
		cp.ansphone();
		cp.pickOut();
		cp.ansphone();
		
		
	}

}

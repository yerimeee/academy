package Phone05;

public class PhoneTest {	//아무것도 상속받지 않으면 컴파일러가 'extends Object(최상위 클래스: 해시코드의 메서드들을 가지고 있음)'를 컴파일함.

	public static void main(String[] args) {

		SmartPhone sp = new SmartPhone();
		sp.call();
		sp.call();
		sp.massage("안녕");
		sp.video("싸이월드");
		sp.kakao("상태메시지");
		sp.internet("python");
		sp.ansphone();
		sp.ansphone();
		System.out.println("-----------------------");
		
		CellPhone cp = new CellPhone();
		cp.call();
		cp.call();
		cp.massage("스마트폰이 아닙니다");
		cp.video("구버전의 유튜브");
		cp.ansphone();
		cp.ansphone();
		
	}

}

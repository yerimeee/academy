package Phone05;

public class SmartPhone extends CellPhone {

	public void kakao(String talk) {
		System.out.println("카톡의 " + talk + "를 봅니다.");
	}
	
	public void internet(String serch) {
		System.out.println(serch + " 내용을 인터넷에 검색합니다.");
	}
	void sound() {
		System.out.println("띠리링");
	}
	void pickUp() {
		System.out.println("수신 버튼을 누르십시오");
	}
	
	void pickOut() {
		System.out.println("종료 버튼을 누르십시오");
	}
}

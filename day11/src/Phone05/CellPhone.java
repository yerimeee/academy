package Phone05;

public class CellPhone extends Phone {

	void massage(String msg) {
		System.out.println(msg + " 내용의 문자를 보냅니다.");
	}
	
	void video(String play) {
		System.out.println(play + "의 영상을 봅니다.");
	}
	
	@Override
	void sound() {
		System.out.println("따르릉");
	}
	
	void pickUp() {
		System.out.println("핸드폰을 여십시오");
	}
	
	void pickOut() {
		System.out.println("핸드폰을 닫으십시오");
	}
}

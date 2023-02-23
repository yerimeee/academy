package tv04;

public class SmartTv extends Tv {

	void search(String str) {
		System.out.println("인터넷에 " + str + "을 검색합니다.");
	}
	void netflix(String name) {
		System.out.println("콘텐츠 " + name + "를 재생합니다");
	}
}

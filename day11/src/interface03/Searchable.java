package interface03;

public interface Searchable {
	void search(String msg);
	default void internet(String url) {	//나중에 필요한 기능 메서드 추가할 때 오버라이딩 구현해줘도 안 해줘도 ㄱㅊ은 메서드
		System.out.println("인터넷 보기");
	}
	static void sInter() {	//static 메서드랑 똑같음. 
		System.out.println("kkkkk");
	}
}

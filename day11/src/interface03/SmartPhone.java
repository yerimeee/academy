package interface03;

public class SmartPhone implements Phone, Searchable {
	int volume;
	
	@Override
	public void search(String msg) {
		System.out.println(msg + "를 검색한 결과입니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전화를 받습니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("전화를 끊습니다.");
	}

	@Override
	public void setVolume(int volume) {
		if(Phone.MAX_VOLUME < volume)	
		//지역변수에도 인스턴스변수에도 상속받은 인터페이스에도 Phone에만 있기 때문에 클래스 이름(Phone.) 명시안 해도 되긴 함
			this.volume = Phone.MAX_VOLUME;
		else if (Phone.MIN_VOLUME > volume) 
			this.volume = Phone.MIN_VOLUME;
		else
			this.volume = volume;
		System.out.println("현재 음량: " + this.volume);	
		//그냥 volume쓰면 60을 넣든 100을 넣든 그 값이 출력되기 때문에 if문에 해당하는 값만을 넣으려면 this.
	}
	
	@Override
	public void internet(String url) {
		System.out.println(url + "을 엽니다.");
	}

}

package tv03;

public class Tv3 {

	// tv의 속성
	String company;	// 아무것도 안 넣으면 null(디폴트)값이 배정
	String model;
	int ch;		// 아무것도 안 넣으면 0값이 배정
	int volume;
	boolean power;	// 아무것도 안 넣으면 false값이 배정
	
	// tv의 기능(메서드)
	void power() {
		power = !power;	//전원이 꺼지면 켜져야되고 켜지면 꺼져야 되니까 !넣어줌
		if(power == true) 
			System.out.println("전원 ON");
			else
				System.out.println("전원 OFF");		
	}
	int chUp() {
		++ch;
		return ch;
	}
	int chDown() {
		--ch;
		return ch;
	}
	int volume(int volume1) {
		volume = volume1;
		return volume;
	}
	//설명 추가
	void volume2(int volume1) {
		volume = volume1;	//클래스 변수에 매개변수 값을 넣어줘야 음량 값을 바꿀 수 있음.
		System.out.println("음량을 조절합니다.");
	}
	int volumeUp(int volume1) {
		volume += volume1;	//사용자가 넣은 volume1값을 더해서 volume에 대입
		return volume;
	}
	int volumeDown(int volume1) {
		volume -= volume1;
		return volume;
	}
}

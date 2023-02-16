package tv03;

public class Tv {

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
	void chUp() {
		++ch;
		System.out.println("현재 채널은 " + ch + "입니다.");
	}
	void chDown() {
		--ch;
	}
	void volumeUp() {
		++volume;
	}
	void volumeDown() {
		--volume;
	}
}

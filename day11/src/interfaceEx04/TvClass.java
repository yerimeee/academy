package interfaceEx04;

public class TvClass implements Tv, SmartTv {
	int channel;
	
	@Override
	public void serch(String serch) {
		System.out.println(serch + "를 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("전원을 켭니다.");
		
	}

	@Override
	public void turnOff() {
		System.out.println("전원을 끕니다."); 
		
	}

	@Override
	public void setchannel(int channel) {
		if(Tv.MAX_CHANNEL < channel)
			this.channel = Tv.MAX_CHANNEL;
		else if(Tv.MIN_CHANNEL > channel)
			this.channel = Tv.MIN_CHANNEL;
		else
			this.channel = channel;
		System.out.println("현재 채널: " + this.channel);
	}
	
}

package interface03;

public interface Phone {
	int MAX_VOLUME = 50;
	int MIN_VOLUME = 0;
	
	void turnOn();
	void turnOff();
	void setVolume(int volume);	//int를 위에서 int volume = 9; 와 같이 선언하면 고정값이 돼서 선언해주면 안 됨. 
}

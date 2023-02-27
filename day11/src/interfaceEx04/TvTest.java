package interfaceEx04;

public class TvTest {

	public static void main(String[] args) {
		TvClass tc = new TvClass();
		tc.turnOn();
		tc.setchannel(120);
		tc.serch("넷플릭스");
		tc.setchannel(-5);
		tc.turnOff();
	}

}

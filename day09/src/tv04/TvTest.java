package tv04;

public class TvTest {

	public static void main(String[] args) {

		SmartTv st1 = new SmartTv();
		st1.power();
		st1.channelUp();
		st1.search("java");
		st1.netflix("더 글로리");
		st1.power();
	}

}

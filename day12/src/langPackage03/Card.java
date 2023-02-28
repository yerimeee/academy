package langPackage03;

public class Card implements Cloneable {
	String kind;
	int number;
	
	Card() {
		this("SPADE", 7); 
	}
	Card(String kind, int number) {
		this.kind = kind;
		this.number = number;
	}
	
	@Override
	public String toString() {
		return "종류: " + kind + " 숫자: " + number;
	}
	
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();	//clone 원형이 throws로 되어있기 때문에 try블럭으로 감싸줘야함
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return obj;
	}
}

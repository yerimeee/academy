package interface03;

public class PhoneTest {

	public static void main(String[] args) {
		SmartPhone sp = new SmartPhone();
		sp.turnOn();
		sp.setVolume(80);
		sp.search("인터페이스");
		sp.turnOff();
		System.out.println("-------------------");
		
		Phone phone = sp;	//Phone으로 형변환
		phone.turnOn();
		phone.setVolume(-10);
		phone.turnOff();
		System.out.println("-------------------");
		
		Searchable sa = sp;	//Searchable로 형변환
		sa.search("여기선 얘만 사용가능함");
	}
	static void method(Phone phone) {	//매개변수를 부모타입으로 해놓으면 부모든 자식이든 객체 생성 가능
		phone = new SmartPhone();
	}
}

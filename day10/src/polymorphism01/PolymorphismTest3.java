package polymorphism01;
class Car {
	private String model;
	private int door;
	Car(String model, int door) {
		this.model = model;
		this.door = door;
	}
	void drive() {
		System.out.println("운전중");
	}
	void stop() {
		System.out.println("멈춤");
	}
	void call() {
		System.out.println("신고한 곳으로 이동"); 
	}
}
class Ambulance extends Car {
	Ambulance(String model, int door) {
		super(model, door);
	}
	@Override
	void call() {
		System.out.println("사이렌을 울립니다.");
	}
	void FirstAid() {
		System.out.println("응급처치를 합니다.");
	}
}
class FireEngine extends Car {
	FireEngine(String model, int door) {
		super(model, door);
	}
	@Override
	void call() {
		System.out.println("물을 준비합니다.");
	}
}
public class PolymorphismTest3 {
	public static void main(String[] args) {
		Car car = null;	//지역변수는 초기화를 해줘야되기 때문에 null 값으로 초기화 해준 것.
		FireEngine fe1 = new FireEngine("소방차",2);
		Ambulance ab1 = new Ambulance("구급차",3);
		
		car = fe1;
		car.call();
		car.drive();
		car.stop();
		
		car = ab1;
		car.call();
		car.drive();
		car.stop();
		
		ab1 = (Ambulance)car;	//강제형변환(부모를 자식으로) 
		ab1.call();
		ab1.drive();
		ab1.stop();
		ab1.FirstAid(); //부모 것도 사용하고 내 것도 사용가능
	}

}

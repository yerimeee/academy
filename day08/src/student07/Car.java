package student07;

public class Car {

	String color;
	String model;
	int door;
	
	Car() {
		this("black", "SM7", 5);
		System.out.println("매개변수가 없는 생성자");	//this가 출력문보다 선행되어야함.
	}
	Car(String color) {
		this(color, "SM7", 5);
	}
	Car(int door) {
		this("black", "SM7", door);
	}
	Car(String color, String model) {
		this(color, model, 5);
	}
	Car(String color, int door) {
		this(color, "SM7", door);
	}
	Car(String color, String model, int door) {
		this.color = color;
		this.model = model;
		this.door = door;
		System.out.println("매개변수가 3개인 생성자");
	}

}
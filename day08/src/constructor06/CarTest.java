package constructor06;

public class CarTest {

	public static void main(String[] args) {

		Car car1 = new Car("black", "제네시스", 5);
		System.out.println("car1 색상: " + car1.color);
		System.out.println("car1 모델: " + car1.model);
		System.out.println("car1 문 개수: " + car1.door);
		System.out.println("----------------------");
		
		//객체 생성시 바로 초기화되기 때문에 다른 값이 출력됨
		Car car2 = new Car("white", "스포츠카", 3);
		System.out.println("car2 색상: " + car2.color);
		System.out.println("car2 모델: " + car2.model);
		System.out.println("car2 문 개수: " + car2.door);
	}

}

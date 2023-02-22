package student07;

public class StudentTest {

	public static void main(String[] args) {

		Student1 st1 = new Student1("홍길동", 20230201, "010-1234-5678");
		System.out.println("첫번째 학생 이름: " + st1.name + " /학번: " + st1.idNum + " /전화번호: " + st1.telNum);
		
		Student1 st2 = new Student1("이순신", 20230202, "010-9876-5432");
		System.out.println("두번째 학생 이름: " + st2.name + " /학번: " + st2.idNum + " /전화번호: " + st2.telNum);
		
		Student1 st3 = new Student1("아무개", 20230203, "010-2938-4857");
		System.out.println("세번째 학생 이름: " + st3.name + " /학번: " + st3.idNum + " /전화번호: " + st3.telNum);
		
		Car car1 = new Car(3);
		Car car2 = new Car("yellow");
		
		Car car3 = new Car("Green", "K7");
		System.out.println("---------------------------");
		Car car4 = new Car();
		
		System.out.println("색상: " + car1.color);
		System.out.println("문 개수: " + car1.door);
		
		
	}

}

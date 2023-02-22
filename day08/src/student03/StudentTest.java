package student03;

public class StudentTest {

	public static void main(String[] args) {

		Student.class1 = "Java반";
		Student st1 = new Student();
		st1.name = "홍길동";
		st1.stuNum = 20230201;
		st1.addr= "서울 당산동";
		
		Student.class1 = "Java반";
		Student st2 = new Student();
		st2.name = "아무개";
		st2.stuNum = 20230202;
		st2.addr= "서울 종로구";
		
		System.out.println("학급명: " + Student.class1);
		System.out.println("이름: " + st1.name);
		System.out.println("학번: " + st1.stuNum);
		System.out.println("주소: " + st1.addr);
		System.out.println("------------------------");
		
		System.out.println("학급명: " + Student.class1);
		System.out.println("이름: " + st2.name);
		System.out.println("학번: " + st2.stuNum);
		System.out.println("주소: " + st2.addr);
		System.out.println("===========================");
		
		Student.class1 = "공공데이터융합반";
		System.out.println("학급명: " + Student.class1);
		System.out.println("이름: " + st1.name);
		System.out.println("학번: " + st1.stuNum);
		System.out.println("주소: " + st1.addr);
		System.out.println("------------------------");
		
		System.out.println("학급명: " + Student.class1);
		System.out.println("이름: " + st2.name);
		System.out.println("학번: " + st2.stuNum);
		System.out.println("주소: " + st2.addr);
		
		Student.totalCount(28); //객체 생성 하지 않고도 사용가능
		st1.totalCount(25);	//void라서 바로 출력 가능
	}

}

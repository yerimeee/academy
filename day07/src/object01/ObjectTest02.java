package object01;

class Kh {	//라이브러리용
	String addr = "서울";
	int num = 10;
}

class Student {	//라이브러리용, 이렇게 하나의 프로젝트에 넣어놓지 말고 클래스 구분해서 따로 사용 권장.
	String name = "홍길동";
	boolean gender = true;
}

public class ObjectTest02 {	//실행용, public(다른 프로젝트에서 사용 가능)은 하나만 쓸 수 있음.
	public static void main(String[] args) {

		Kh kh1 = new Kh();
		Student st = new Student();
		Car car = new Car();
	}

}

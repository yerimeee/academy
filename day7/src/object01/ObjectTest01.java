package object01;

public class ObjectTest01 {

	public static void main(String[] args) {

		//실행용 클래스
		Object01 ob1 = new Object01();
		
		System.out.println(ob1.name);
		
		ob1.tel = "02-9876-5432";
		System.out.println(ob1.tel);
		
		System.out.println(ob1.addr);
		System.out.println(ob1.num);
		
		ob1.addr = "인천시 남동구 구월동";
		System.out.println("---------------------------");
		System.out.println("ob1객체의 주소: " + ob1.addr);
		System.out.println("ob1객체의 이름: " + ob1.name);
		System.out.println("ob1객체의 전화: " + ob1.tel);
		System.out.println("ob1객체의 숫자: " + ob1.num);
		
		Object01 ob2 = new Object01();
		System.out.println("---------------------------");
		System.out.println("ob2객체의 주소: " + ob2.addr);
		System.out.println("ob2객체의 이름: " + ob2.name);
		System.out.println("ob2객체의 전화: " + ob2.tel);
		System.out.println("ob2객체의 숫자: " + ob2.num);
		System.out.println("---------------------------");
		
		Car dream = new Car();
		System.out.println("car객체의 회사명: " + dream.com);
		System.out.println("car객체의 모델명: " +dream.name);
		System.out.println("car객체의 색상: " +dream.color);
		System.out.println("car객체의 기어: " +dream.gear);
		System.out.println("car객체의 최대속도: " +dream.speed);
		System.out.println("---------------------------");
		dream.color = "White";
		System.out.println("car객체의 색상: " +dream.color);
	}

}

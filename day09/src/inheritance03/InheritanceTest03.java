package inheritance03;

class A1 {
	int i;
}

class B1 extends A1 {
	String i;
}

public class InheritanceTest03 {

	public static void main(String[] args) {

		B1 b1 = new B1();
		b1.i = "kh정보교육원";
		System.out.println(b1.i);
		// 우선순위는 하위 클래스에 변수가 있으면 먼저 실행됨.
		//b1.i = 100; 오류남. 제일 먼저 B1의 i를 보니 String 형태의 kh~가 들어가있기 때문에 정수는 쓸 수 없음.
		
		A1 a1 = new A1();
		a1.i = 100;	//얘는 가능~
	}

}

package objectMethod02;

class Op {
	//method(기능)
	void print1() {
		System.out.println("반환값이 없고 매개변수가 없는 메서드");
	}
	int print2() {
		System.out.println("반환값이 정수형이고 매개변수가 없는 메서드");
		return 10;	//반환값 10: int형으로 날 부르면 10을 보내라
	}
	String print3() {
		System.out.println("반환값이 문자형이고 매개변수가 없는 메서드");
		return "정보교육원";
	}
	boolean print4() {
		System.out.println("반환값이 논리형이고 매개변수가 없는 메서드");
		return true;
	}
	//매개변수가 있는 메소드
	void print5(int x) {
		System.out.println("반환값이 없고 매개변수가 정수 하나인 메서드");
		int result = x + 10;
		System.out.println(result);
	}
	String print6(String name) {
		System.out.println("반환값이 없고 매개변수가 문자열 하나인 메서드");
		return name + "님 반갑습니다.";
	}
	int print7(int x, int y) {
		int result = x + y;
		return result;
	}
}

public class MethodTest01 {

	public static void main(String[] args) {

		Op op1 = new Op();
		op1.print1(); //void 메서드 가져와서 쓸 수 있음.
		op1.print2();
		
		int result = op1.print2(); //10을 여기에 대입시켜라
		System.out.println(result);
		System.out.println("==================");
		
		System.out.println(op1.print2());
		System.out.println(op1.print3());
		
		op1.print5(50);
		System.out.println(op1.print6("김예림"));
		
		System.out.println(op1.print7(10,35));
	}

}

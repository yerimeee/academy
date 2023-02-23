package super07;
class Parent {
	int x = 10;
}
class Child extends Parent{
	int x = 100;
	void method() {
		int x = 1000;
		System.out.println("x=" + x);	//지역변수 x가리킴, 지역변수 없었으면 인스턴스 변수 x 가리킴
		System.out.println("this.x=" + this.x);	//자신의 인스턴스 변수 x 가리킴
		System.out.println("super.x=" + super.x); //상위클래스 x 가리킴, 상위 클래스에 x가 없었다면 오류남.
	}
}

public class SuperTest {

	public static void main(String[] args) {

		Child ch = new Child();
		ch.method();
	}

}

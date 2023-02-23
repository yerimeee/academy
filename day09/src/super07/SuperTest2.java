package super07;
class Parent1 {
	int x = 10;
	void show() {
		System.out.println("상위 클래스 show() 메서드");
	}
}
class Child1 extends Parent1 {
	int x = 100;
	void show() {
		System.out.println("하위 클래스 show() 메서드");
	}
	void write() {
		show();
		super.show();
		System.out.println("Child1의 x변수: " + x); //지역변수가 없기 때문에 굳이 this. 안 해줘도 됨
		System.out.println("Parent1의 x변수: " + super.x);
	}
}
public class SuperTest2 {
	public static void main(String[] args) {

		Child1 ch1 = new Child1();
		ch1.write();
	}

}

package super07;
class Parent2 {
	int x;
	Parent2(int x) {	//매개변수를 넣는 순간 오류.
		this.x = x;
		System.out.println("부모 생성자");
	}
}
class Child2 extends Parent2 {	//상속을 받으려면 상위 클래스에서 객체가 생성되고 그걸 받는 건데 상위 보니까 x값을 할당해야 객체가 만들어짐
	int x = 10;
	Child2() {
		super(3); //x에 해당하는 값을 하위 클래스에서 명시적으로 넣어줘야 오류가 나지 않음.
		System.out.println("자식 생성자");
	}
	void superX() {
		System.out.println(super.x);
	}
}
public class SuperTest3 {
	public static void main(String[] args) {

		Child2 ch2 = new Child2();
		ch2.superX();
	}

}

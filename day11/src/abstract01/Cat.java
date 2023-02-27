package abstract01;

public class Cat extends Animal {
	Cat() {
		kind = "포유류";
	}
	//이름이 같으면 @Override 없어도 가능 근데 그러면 스펠링 조심해라
	void sound() {
		System.out.println("야옹");
	}
}

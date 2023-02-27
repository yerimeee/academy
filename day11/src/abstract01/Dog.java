package abstract01;

public class Dog extends Animal {
	Dog() {	//생성자
		kind = "포유류";
	}

	@Override
	void sound() {	//추상메서드 구현부 완성
		System.out.println("멍멍");
	}
}

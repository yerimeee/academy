package overriding06;
class Ea {
	void print() {
		System.out.println("상위 클래스의 print() 메소드");
	}
}

class Eb extends Ea {
	void print() {
		System.out.println("하위 클래스의 print() 메소드");
	}
}

public class OverridingTest {

	public static void main(String[] args) {

		Eb eb = new Eb();
		eb.print();	//오버라이딩
		
		Ob ob = new Ob();
		ob.show();	//오버로딩(상속,메서드,생성자에서 사용가능)
		ob.show("인자1개");
		
	}

}

class Oa {
	void show() {
		System.out.println("상위 show() 메서드");
	}
}	
class Ob extends Oa {
	//매개변수가 달라서 오버로딩!
	void show(String name) {
		System.out.println("하위 show() 메서드" + name);
	}
}


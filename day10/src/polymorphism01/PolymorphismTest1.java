package polymorphism01;
class A { }
class B extends A { }
class C extends A { }
class D extends B { }
class E extends C { }

public class PolymorphismTest1 {

	public static void main(String[] args) {

		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		A a1 = b; //객체 B의 저장공간을 사용 안 하고 A만 사용하겠다는 말 => A로 형변환
		A a2 = c;
		A a3 = d; //객체 D와 B를 사용 안 하고 A만 사용하겠다는 말. D가 B를 상속받았기 때문. => A로 형변환
		A a4 = e; //객체 E와 C를 사용 안 하고 A만 사용하겠다는 말. 상속 관계니까. => A로 형변환
		B b1 = d; //D만 사용 안 하고 B로 형변환 하여 B와 A를 사용하겠다는 말.
		C c1 = e; //E를 C 타입으로 변환하여 C와 A를 사용하겠다는 말.
	}

}

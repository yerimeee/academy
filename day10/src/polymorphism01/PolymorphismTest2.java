package polymorphism01;
class Parent {
	void method1() {
		System.out.println("부모의 메소드1");
	}
	void method2() {
		System.out.println("부모의 메소드2");
	}
}
class Child extends Parent {
	void method3() {
		System.out.println("자식의 메소드3");
	}
	void method4() {
		System.out.println("자식의 메소드4");
	}
	@Override	//오버라이드 할 거라고 미리 명시하면 스펠링 틀리는 오류를 예방할 수 있음.
	void method2() {
		System.out.println("부모의 메소드2를 오버라이딩");
	}
}
public class PolymorphismTest2 {
	public static void main(String[] args) {

		/*
		 * Child c1 = Child(); 
		 * Parent p1 = c1;
		 * 이거를 밑에 한 줄로 표현 가능
		 */ 
		Parent p1 = new Child();
		//p1.method3() 오류. 부모 타입으로 형변환 했기 때문에 부모의 메소드만 쓸 수 있어서 자식 것 호출 불가.
		p1.method1();
		p1.method2();	//오버라이딩 한 것은 부모 타입 형 변환 상관없이 무조건 자식 것이 출력됨. super로 호출하면 부모것으로 가능
		
	}

}

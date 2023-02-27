package interface02;

public class InterfaceTest1 {
	public static void main(String[] args) {

		InterClass ic = new InterClass();
		
		//인터페이스는 객체 생성 불가, 자료형변환은 가능
		Interface interf = ic; //클래스를 부모 타입으로 형변환
		interf.method();
		interf.methodA1();
		interf.methodB();
		
		System.out.println(interf.MAX);
		
		InterfaceA interA = ic;	//Interface의 부모이기 때문에 형변환 가능
		interA.methodA();	//InterfaceA에 있는 것만 사용가능
		
		InterfaceB  interB = ic;
		interB.methodB1();	//InterfaceB에 있는 것만 사용가능
	}

}

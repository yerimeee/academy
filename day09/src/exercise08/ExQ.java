package exercise08;
//부모클래스 변수 1개(a의 제곱값), 생성자(매개변수 int형 1개){매개변수의 값 a의 제곱을 하여 인스턴스 변수에 저장}
//자식클래스 변수 1개(b의 제곱값), 생성자(int a, int b){매개변수의 값 b의 제곱을 하여 인스턴스 변수에 저장}
class Par {
	int a;
	Par(int a){
		this.a = a*a;
		System.out.println("a의 값: " + this.a);
	}
}
class Chi extends Par {
	int b;
	Chi(int a, int b) {
		super(a);
		this.b = b*b;
		System.out.println("b의 값: " + this.b);
		}
	}
public class ExQ {
	public static void main(String[] args) {

		Chi chX = new Chi(2,3);
		//System.out.println("a의 값: " + chX.a);
		//System.out.println("b의 값: " + chX.b);
	}

}

package init01;

public class Init {

	int num = 10;
	static int sNum = 100;
	
	
	//인스턴스 초기화 블럭: Test에서 객체가 생성될 때 호출
	{
		System.out.println("인스턴스 초기화 블럭"); //순서4
		System.out.println("인스턴스 변수 num = " + num); //순서5
		num = 1; //순서6
		sNum = 800; //객체가 생성되기 전에 클래스가 먼저 저장공간이 생기기 때문에 클래스 변수 호출은 가능
	}
	
	//클래스 초기화 블럭: 클래스가 생성될 때 호출
	static {
		System.out.println("클래스 초기화 블럭"); //순서1
		System.out.println("클래스 변수 sNum = " + sNum); //순서2
		sNum = 200; //순서3
		//객체가 생성되지 않아서(저장 공간이 없음) num값을 호출할 수 없음
	}
	
	//생성자: 객체가 생성될 때 호출
	Init() {
		System.out.println("생성자 호출"); //순서7
		System.out.println("인스턴스 변수 num = " + num); //순서8
		System.out.println("클래스 변수 sNum = " + sNum); //순서9
		num = 2;
		sNum = 500; //순서10
	}
}

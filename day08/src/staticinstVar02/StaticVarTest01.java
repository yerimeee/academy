package staticinstVar02;

public class StaticVarTest01 {

	public static void main(String[] args) {

		StaticVar01 s1 = new StaticVar01();
		StaticVar01 s2 = new StaticVar01();
		StaticVar01 s3 = new StaticVar01();
		
		s1.num1 = 10;
		s2.num1 = 20;
		s3.num1 = 30;
		
		System.out.println("s1.num1 = " + s1.num1);
		System.out.println("s2.num1 = " + s2.num1);
		System.out.println("s3.num1 = " + s3.num1);
		System.out.println("======================");
		
		System.out.println("s1.staNum1 = " + s1.staNum1);
		System.out.println("s2.staNum1 = " + s2.staNum1);
		System.out.println("s3.staNum1 = " + s3.staNum1);
		//실행순서가 staNum1을 1. 지역변수에서 먼저 찾고 없으면 2. 인스턴스 변수에서 찾고 없으면 3. 클래스 변수에 가서 있는 값 가져옴
		System.out.println("======================");
		
		s1.staNum1 = 500;
		System.out.println("s1.staNum1 = " + s1.staNum1);
		System.out.println("s2.staNum1 = " + s2.staNum1);
		System.out.println("s3.staNum1 = " + s3.staNum1);
		
		System.out.println(StaticVar01.staNum1);
		System.out.println(Math.PI);  //PI 원형: 객체를 따로 생성하지 않았고(그럼 static!) 대문자라 상수(final!)임을 가리킴
		
	}

}

package operator04;

import java.util.Arrays;

public class OperatorTest {
	int b1; //인스턴스 변수(객체를 생성해야만 사용)
	static int c1 = 20; //클래스 변수
	
	public static void main(String[] args) {
		int a = 10; //지역변수
		Operator op1 = new Operator();
		op1.add(9.7);	//값이 실수이기 때문에 api에서 double형의 매개변수 하나인 곳에 들어감.
		System.out.println(op1.add(9.7));
		System.out.println(op1.add(5, 4));
		System.out.println(op1.add(31.56, 83.86));
		System.out.println(op1.add());
		System.out.println("---------------------");
		
		System.out.println(op1.sub());
		System.out.println(op1.sub(3));
		System.out.println(op1.sub(9,3));
		System.out.println(op1.time());
		System.out.println(op1.time(10,10));
		System.out.println(op1.div(5.2));
		System.out.println(op1.div(30,5));
		System.out.println("---------------------");
		
		int[] arr = {3, 8, 19, 38, 100, 293, 489};
		
		int arr2[] = new int[100];
		int value = 0;
		for(int i=0; i<arr2.length; i++) {
			value += 3;
			arr2[i] = value;
		}
		System.out.println(op1.add(arr2));
		System.out.println(Arrays.toString(arr2)); //배열에 넣어진 값 출력
		
		System.out.println("클래스 메서드 호출: " + msg()); //같은 클래스에 있기 때문에 '클래스명.' 안해줘도 됨
		System.out.println("클래스 변수 값: " + c1);
		
		OperatorTest ot = new OperatorTest();	//객체 생성
		System.out.println("인스턴스 변수 값: " + ot.b1);
		System.out.println("인스턴스 메서드 호출: " + ot.sum2(op1.num1));
	}
	//main함수 외에서 메서드를 만드려고 하면 static을 넣어줘야됨. 
	static String msg() {
		return "안녕";
	}
	int sum2(int a) {	//static 안 넣어주면 객체 생성해줘야됨
		return a+100;
	}

}

package casting02;

public class OperCasting03 {

	public static void main(String[] args) {

		byte b1 = 10;
		byte b2 = 30;
		
		int int1 = b1 + b2; // int형 보다 작은 자료형을 연산하면 int로 자동 형변환
		byte b3 = (byte)(b1 + b2); // 명시적 형변환
		
		short s1 = 34;
		short s2 = 54;
		
		int int2 = s2-s1;
		int int3 = s1*b2; // short*byte해도 무조건 int됨.
		
		char c1 = '&';
		char c2 = 'a'+3;
		int c3 = c1+c2;
		System.out.println(c3);
		
		//int 보다 큰 자료형으로 오칙연산(%도 포함)을 하면 큰 자료형(long,float,double 등)으로 자동형변환
		long long1 = 12341235673246L; //int안에 저 값이 다 들어가지 못해서 식별자 써서 자동형변환 시켜줌
		long l1 = long1*c3;
		
		//둘 다 이렇게 변형 가능
		float f1 = 3.15f;
		float f2 = (float)3.15;
		
		float f3 = f1+c3;
		
		/*
		 * char c5 = 'a';
		char c6 = c5+10;  오류 주의!!
		*/
	}

}

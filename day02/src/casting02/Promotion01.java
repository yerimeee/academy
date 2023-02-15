package casting02;

public class Promotion01 {

	public static void main(String[] args) {
		
		int num1 = 1234567890;
		int num2 = 1234567890;
		
		//자동형 변환 작은 타입 -> 큰 타입에 넣을 때
		//자동으로 형이 변환되어 들어간다.
		float num3 = num2; //num2는 int인데 float(int보다 더 큼)이 있기 때문에 float형으로 변환되어 num3로 들어감.
		// byte byte1 = num1; //큰 것에서 작은 것으로 변환하려고 하면 자료의 손실이 있기 때문에 오류남.
		long num4 = num1;
		
		// 값이 넘어서면 이상한 값이 나옴.
		int result = num1 * num2; //결과 값이 int보다 넘어가면 값이 할당된 원판에서 한 바퀴 돌아 다시 할당된다고 보면 됨.
		System.out.println(result);
		
		byte b1 = 40;
		short sh1 = b1;
		
		//int보다 다 작기 때문에 넣기 가능.
		char ch = 78;
		int num5 = ch;
		num5 = b1;
		num5 = sh1;
		
		//double이 가장 크기 때문에 뭘 넣어도 가능.
		double dou1 = ch;
		dou1 = num5;
		dou1 = b1;
		dou1 = sh1;
		
		// byte -> short = char -> int -> long -> float -> double // short이랑 char는 둘 다 2바이트로 똑같긴 함 
	}

}

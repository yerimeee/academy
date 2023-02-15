package operator03;

public class Operator02 {

	public static void main(String[] args) {

		int n1 = -20;
		n1 = +n1; //대입 연산자는 사칙연산의 *용법과 같기 때문에 -20이 됨.
		System.out.println(n1);
		
		n1 = -n1;
		System.out.println(n1);
		
		//int/int = int, 결과적으로 몫((정수))만 나옴.
		int x = 10;
		int y = 7;
		int result = x/y;
		System.out.println(result);
		
		double result2 = x/y; //나누기 먼저 하고 대입 연산자가 진행되기 때문에 형변환이 그 뒤에 이루어짐. 그래서 1.0
		System.out.println(result2);
		
		// 실수형으로 결과를 보고 싶으면 두 수 중에 하나가 double형이면 자동 형변환 이루어지면서 실수형 됨.
		result2 = x/(double)y;
		System.out.println(result2);
		
		//%는 나머지
		result = x%y;
		System.out.println(result);
		
		x = 15;
		y = 4;
		
		//15/4의 몫은 3이고, 나머지는 3입니다.
		//System.out.println(x+ "/" + y + "의 몫은 " + x/y + "이고, 나머지는 " + x%y + "입니다."); 이 방법도 있음.
		
		int result3 = x/y;
		int result4 = x%y;
		System.out.println( x + "/" + y + "의 몫은 " + result3 + "이고, 나머지는 " + result4 +"입니다." );
		
	}

}

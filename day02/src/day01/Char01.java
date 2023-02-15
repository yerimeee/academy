package day01;

public class Char01 {

	public static void main(String[] args) {

		char ch1 = 'A';
		char ch2 = 65; //아스키 코드표를 보기 때문에 65의 아스키코드가 대문자 A를 의미함.
		char ch3 = '\u0041'; // \ u :유니코드라는 뜻
		System.out.println(ch1);
		System.out.println(ch2);
		System.out.println(ch3);
		
		char ch4 = '가';
		char ch5 = 44032;
		char ch6 = '\uac00';
		System.out.println(ch4);
		System.out.println(ch5);
		System.out.println(ch6);
		
		int unicode = '정';
		System.out.println(unicode);
		
		char ch7 = 'a' + 1; // a=97 + 1 = 98 = b , 리터럴(저장공간 만들고 바로 대입)에서는 연산식 사용가능
		System.out.println(ch7);
		
		// char ch8 = ch7 + 1; //ch7 변수에 캐릭터 값이 들어가있기 때문에 리터럴이 아니어서 연산식 사용불가
		
		char ch8 = 'A' + 'B';
		System.out.println(ch8); //이건 출력 안 됨.
		
		int ch9 = 'A' + 'B';
		System.out.println(ch9); //이건 출력 가능.
	}

}

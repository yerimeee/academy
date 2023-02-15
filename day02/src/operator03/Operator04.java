package operator03;

public class Operator04 {

	public static void main(String[] args) {

		//논리연산자 
		// &&: 조건이 모두 다 참일 때만 참
		// ||: 조건에 하나라도 참이 있으면 참
		
		int num1 = 10;
		int num2 = 10;
		
		System.out.println(num1>20 && num2>5); //둘 다 참이어야 참
		System.out.println(num1>20 || num2>5); //한 개만 참이어도 참
		System.out.println("========");
		
		int num3 = 10;
		System.out.println(!(num1<20 && num2>5 && num3<15)); // !해주면 결과값과 반대로 나옴.
		System.out.println(num1<20 || num2>5 || num3>15);
		System.out.println("========");
		
		// ! : not
		boolean bool = true;
		bool = !bool;
		System.out.println(bool);
		
		char ch = 'A'; //아스키코드 참고 
		bool = ch < 'C';
		System.out.println(bool);
		System.out.println("========");
		
		System.out.println((ch >= 'A') && (ch <= 'Z')); // 65 ~ 90, 괄호로 묶은 건 보기 편하라고 하는 관례
		System.out.println((ch >= 'a') && (ch <= 'z'));
		System.out.println((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'));
	}

}

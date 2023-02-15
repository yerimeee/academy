package operator03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		//사용자로부터 숫자 2개를 입력받아 사칙연산과 몫, 나머지를 출력하시오.
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.println("두번째 숫자: ");
		int num2 = sc.nextInt();
		
		int r1 = num1+num2;
		System.out.println(num1 + "+" + num2 + "=" + r1);
		int r2 = num1-num2;
		System.out.println(num1 + "-" + num2 + "=" + r2);
		int r3 = num1*num2;
		System.out.println(num1 + "*" + num2 + "=" + r3);
		double r4 = num1/(double)num2;
		System.out.println(num1 + "/" + num2 + "=" + r4);
		int r5 = num1/num2;
		System.out.println(num1 + "/" + num2 +"의 몫은 " + r5);
		int r6 = num1%num2;
		System.out.println(num1 + "/" + num2 + "의 나머지는 " + r6);
		//이렇게 변수로 쓰지말고 출력식에서 바로 나올 수 있음. 그것도 연습해라. 짧게 하는게 좋은 프로그래밍임.
		
	}

}

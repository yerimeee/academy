package operator03;

import java.util.Scanner;

public class Operator06 {

	public static void main(String[] args) {
		
		//삼항연산자(조건연산자)
		// 조건식 ? 식1 : 식2 => 조건식이 참이면 식1 조건식이 거짓이면 식2
		
		int a = 10;
		int b = 5;
		int result = a > b ? a : b; // 두 수 중에 큰 수를 반환해줌
		System.out.println(result);
		
		//사용자로부터 두 수를 입력받아 더 큰 숫자를 출력하시오.
		
		Scanner sc1 = new Scanner(System.in);
		
		/*
		 * System.out.println("첫 숫자 : "); int num1 = sc1.nextInt();
		 * System.out.println("두번째 숫자 : "); int num2 = sc1.nextInt();
		 * System.out.println("더 큰 숫자는? " + (num1 > num2 ? num1 : num2));
		 */
		
		//사용자로부터 숫자 하나를 입력받아 짝수인지 홀수인지 출력하시오
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자: ");
		int num3 = sc.nextInt();
		String str = num3 % 2 == 0 ? "짝수" : "홀수";
		System.out.println("이 숫자는 " + str + "입니다.");
		// System.out.println(num3 % 2 == 0 ? "짝수" : "홀수"); 변수 말고 이렇게도 가능 
	}

}

package switchCase02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {

		// 사용자로부터 오칙연산(+,-,*,/,%) 3개(숫자로2개, 문자로1개)를 switch case문으로 출력하시오.
		Scanner scan =  new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력하시오 : ");
		int num1 = scan.nextInt();
		System.out.println("두번째 숫자를 입력하시오 : ");
		int num2 = scan.nextInt();
		System.out.println("연산자를 입력하시오 : ");
		String st = scan.next();
		
		switch (st) {
		case "+":
			System.out.println(num1  + "+" + num2 + "=" + (num1+num2)); //괄호 또 안 써주면 오류난다!!!!
			break;
		case "-":
			System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
			break;
		case "*":
			System.out.println(num1 + "*" + num2 + "=" + num1*num2); // *,/는 괄호할 필요 없음!!!!
			break;
		case "/":
			System.out.println(num1 + "/" + num2 + "=" + num1/num2);
			//System.out.println("%d/%d=%.2f", num1, num2, (double)num1/num2); 실수로 나타내려면 이것도 가능
			break;
		case "%":
			System.out.println(num1 + "%" + num2 + "=" + num1%num2);
			break;
		default :
			System.out.println("잘못입력하셨습니다.");
		}
	}

}

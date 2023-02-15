package ifelse01;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//사용자로부터 숫자 한 개를 입력받아 0, 음수, 양수를 if~else문으로 출력하시오.
		
/*		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요 : ");
		int num = sc.nextInt();
		if(num > 0)
			System.out.println("양수입니다.");
		else if(num < 0)
			System.out.println("음수입니다.");
		else 
			System.out.println("0입니다.");
		*/
		int score = 69;
		if(score <0 || score >100)
			System.out.println("점수는 0~100을 입력 해야 합니다.");
		else if(score <= 100 && score >= 90)
			System.out.println("A학점입니다.");
		else if(score <90 && score >= 80)
			System.out.println("B학점입니다.");
		else if(score <80 && score >= 70)
			System.out.println("C학점입니다.");
		else
			System.out.println("재평가 대상입니다.");
		
	}

}

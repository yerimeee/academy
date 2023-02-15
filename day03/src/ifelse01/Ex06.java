package ifelse01;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {

		//점수(0~100)를 입력받아서 70점 이상이면 합격 그 중에서도 90점 이상이면 장학생, 그 나머지는 축하합니다, 
		// 70점 미만이면 불합격을 중첩 if문으로 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num >= 70 || num >= 0) {
			System.out.println("합격입니다.");
		if(num >=90 || num >= 0)
			System.out.println("장학생입니다.");
		else 
			System.out.println("축하합니다!");
	}
		else
			System.out.println("불합격입니다.");
		
		System.out.println("고생하셨습니다!");
		
		//중첩 if를 이용하여 A+,A-,B+,B- 출력하시오.
		if(num>=90) {
			if(num>=95)
				System.out.println("A+ 입니다.");
			else
				System.out.println("A- 입니다.");
		}else if(num >= 80) {
			if(num>=85)
				System.out.println("B+ 입니다.");
			else
				System.out.println("B- 입니다.");
		}
		//이 방법도 있음
		char ch1=' ', ch2=' ';
		if(num >= 90) {
			ch1 = 'A';
			if(num >= 95) {
				ch2 = '+';
			}else {
				ch2 = '0';
			}
		}else if(num >= 80) {
			ch1 = 'B';
			if(num >= 85)
				ch2 = '+';
			else
				ch2 = '0';
	}
		System.out.println("당신의 학점은" + ch1 + ch2 + "입니다.");
	}
}

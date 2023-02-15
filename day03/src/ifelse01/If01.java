package ifelse01;

import java.util.Scanner;

public class If01 {

	public static void main(String[] args) {
		//if(조건식) {조건이 참일 때만 실행할 구문}
		int score = 93;
		
		if(score>=80) {
			System.out.println("합격입니다.");
		}
		
		if(score<60) 
			System.out.println("재평가대상입니다."); //실행문이 한 줄일 때는 {} 안써도 됨.
		
		if(score >= 90) {
			System.out.println("합격입니다.");
			System.out.println("우수한 성적입니다.");
		}
		int num = 3;
		if(num == 0)
			System.out.println(num + "은 0입니다.");
		if(num>0) {
			System.out.println("양수입니다.");
			System.out.println("0보다 큰 수 입니다.");
		}
		if(num<0) {
			System.out.println("음수입니다.");
			System.out.println("0보다 작은 수 입니다.");
		}	
		
		//사용자로부터 숫자 하나를 입력받아 홀수인지 짝수인지 구별하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자 : ");
		int num1 = sc.nextInt();
		if(num1%2 ==0)					//System.out.println(num1%2 == 0? "짝수":"홀수"); 이것도 가능
			System.out.println("짝수");
		if(num1%2 !=0)
			System.out.println("홀수"); 
	}

}

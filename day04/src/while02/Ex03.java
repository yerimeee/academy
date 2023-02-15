package while02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {

		//사용자로부터 점수를 입력받아 A~F학점 출력, 사용자가 점수(1~100)를 넣으면 계속, -1을 넣으면 정지
		Scanner sc = new Scanner(System.in);
		int i = 0;
		while(true) {
			System.out.println("확인 할 점수 : ");
			int score = sc.nextInt();
			
			if(score >=90) 
			System.out.println("A학점");
			else if(score >= 80)
				System.out.println("B학점");
			else if(score >= 70)
				System.out.println("C학점");
			else if(score >= 60)
				System.out.println("D학점");
			else if(score >= 0) 
				System.out.println("F학점");
			if(score == -1) {
				System.out.println("정지합니다.");
				break;			//break 위치 어디에 있어야되는지 잘 파악하고 중괄호 잘 구분해라!!!!!!!!
			}
		}
	}

}

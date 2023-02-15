package switchCase02;

import java.util.Scanner;

public class Switch01 {

	public static void main(String[] args) {

		int num = 7;
		switch(num) {
		case 1 : case 7 :
		case 6 :					// case 1도 case 6도 case 7도 모두 A반이 됨.
			System.out.println("A반");
			break;
		case 2 :
			System.out.println("B반");
			break;
		case 3 :
			System.out.println("C반");
			break;
		case 4:
			System.out.println("D반");
			break;
		default :
			System.out.println("F반");
			
		}
		
		// 달월을 입력받아 switch문으로 사계절을 출력하시오.
		
		Scanner  sc = new Scanner(System.in);
		System.out.println("월을 입력하시오 : ");
		int month = sc.nextInt();
		switch(month) {
		case 3 : case 4 : case 5 :
			System.out.println("봄");
			break;
		case 6 : case 7 : case 8 :
			System.out.println("여름");
			break;
		case 9 : case 10 : case 11 :
			System.out.println("가을");
			break;
		case 12 : case 1 : case 2 :
			System.out.println("겨울");
			break;
		default :
			System.out.println("월에 맞는 숫자를 입력하시오!");
		}
	
		//점수를 입력받아 a b c d 학점을 출력하시오.
		
		Scanner scan = new Scanner(System.in);
		System.out.println("점수를 입력하시오 : ");
		int score = scan.nextInt();
		switch(score/10) {
		case 10 : case 9 : 
			System.out.println("A학점");
			break;
		case 8 : 
			System.out.println("B학점");
			break;
		case 7 : case 6 :
			System.out.println("C학점");
			break;
		case 5 :
			System.out.println("D학점");
			break;
		default :	
			System.out.println("재평가 대상입니다.");
		}
	}

}

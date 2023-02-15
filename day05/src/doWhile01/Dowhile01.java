package doWhile01;

import java.util.Scanner;

public class Dowhile01 {

	public static void main(String[] args) {

		// do while : 한 번은 반드시 실행해야되는 반복문일 때 사용
		Scanner sc = new Scanner(System.in);
		int user = 0;
		do {
			System.out.println("================");
			System.out.println(" 1 | 2 | 3");
			System.out.println(" 계속 | 실행 | 중지");
			System.out.println("================");
			System.out.println("선택하세요: ");
			user = sc.nextInt();
			
		} while(user != 3);  // <=2 이거는 안 되나?? 여쭤보니 된다네요~
		System.out.println("프로그램이 중지되었습니다.");
	}

}

package for01;

import java.util.Scanner;

public class For04 {

	public static void main(String[] args) {

		//구구단 출력 / 2단 출력
		for(int i = 1; i <= 9; i++)
		System.out.println("2*" + i +"=" + (2*i));
		
		//사용자로부터 몇 단을 입력받아서 구구단을 구현하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("알아볼 구구단을 입력하세요 : ");
		int multi = sc.nextInt();
		for(int i = 1; i <= 9; i++)
			System.out.println(multi + "*" + i + "=" + multi*i);
	}

}

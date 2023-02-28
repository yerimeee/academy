package exception01;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class _06_InputMismatchException {

	public static void main(String[] args) {
		System.out.println(Arrays.toString(args));
		
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 3개 입력: ");
		int sum=0;
		for(int i=1; i<=3; i++) {
			System.out.println(i + "번째 정수 입력");
			try {	//try를 밖으로 하면 오류났을 때 for문이 안 돌기 때문에 안에
				int num = scan.nextInt();
				sum += num;
			}catch(InputMismatchException e) {
				System.out.println("정수가 아닙니다.");
				scan.next();	//토큰(줄줄이 이어짐)에 Exception난 것을 버리고 다음 토큰을 가리키도록 함
				i--;	//오류가 났으면 다시 전으로 돌아가서 새로 입력받을 수 있도록 함
			}
		}
		System.out.println("합 = " + sum);
	}
}

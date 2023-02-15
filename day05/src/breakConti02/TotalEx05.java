package breakConti02;

import java.util.Scanner;

public class TotalEx05 {

	public static void main(String[] args) {

		//사용자로부터 입력받은 숫자의 약수 구하기, ex) 12의 약수: 1,2,3,4,6,12
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("숫자(종료시 0입력) : ");
		int num =  sc.nextInt();
		if(num ==0)
			break;
		
		for (int i=1; i<=num; i++) {
			if(num % i ==0) {
				System.out.print(i + ", ");
			}	
		}System.out.println(" ");
	}
	}
}

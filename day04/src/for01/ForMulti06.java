package for01;

import java.util.Scanner;

public class ForMulti06 {

	public static void main(String[] args) {

		//*이 입력한 갯수대로 늘어나게 구현하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 별의 갯수 입력 : ");
		int star = sc.nextInt();
		
		for(int i=1; i<=star; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

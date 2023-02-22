package for01;

import java.util.Scanner;

public class ForMulti06 {

	public static void main(String[] args) {

		//*이 입력한 갯수대로 늘어나게 구현하시오
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 별의 갯수 입력 : ");
		int star = sc.nextInt();
		
		for(int i=1; i<=star; i++) {	//입력한 개수까지의 별이 입력되는 것을 반복. 열로
			for(int j=1; j<=i; j++) {	//별의 개수가 점점 늘어나는 것을 반복. 행으로
				System.out.print("*");
			}
			System.out.println();
		}
	}

}

package while02;

import java.util.Scanner;

public class While02 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("계속하려면(c), 정지하려면(q)를 넣으세요 : ");
			String user = sc.next();
			char ch = user.charAt(0);
			
			if(ch == 'q') {
				System.out.println("정지합니다.");
				break;  //while문 빠져나옴
			}else {
				System.out.println("계속 반복합니다.");
			}
		}
		
	}

}

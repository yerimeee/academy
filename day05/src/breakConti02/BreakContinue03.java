package breakConti02;

import java.util.Scanner;

public class BreakContinue03 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int user = 0;
		while(true) {
			System.out.println("================");
			System.out.println(" 1 | 2 | 3");
			System.out.println(" 계속 | 실행 | 중지");
			System.out.println("================");
			System.out.println("선택하세요: ");
			user = sc.nextInt();
			if(user == 3) {
				System.out.println("프로그램을 종료합니다.");
				break;		//while 빠져나옴
			} else if(!(user ==1 || user ==2)) {	 // '!' 앞에 쓰면 not이 됨.
				System.out.println("메뉴를 잘못 골랐습니다.");
				continue;	//밑에 식들 모두 안 하고 다시 반복문으로 올라감
			}
		}	switch(user) {
		case 1:
			System.out.println("계속을 선택했습니다.");
			break;			//switch 빠져나옴
		case 2:
			System.out.println("게임을 실행합니다.");
			break;
		}
		System.out.println("countinue가 없을 때만 출력.");
	}

}

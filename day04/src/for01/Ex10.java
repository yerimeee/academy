package for01;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {

		//가위(1),바위(2),보(3) 게임 만들기 : 1,-2 =유저 승 -1,2= 컴퓨터 승 0은 무승부
		
		int random = (int)(Math.random()*3)+1;	//랜덤값이었던 0,1,2에 +1을 해서 *3을 써야 맞는 거임.
		Scanner sc = new Scanner(System.in);
		System.out.println("가위바위보에 해당하는 숫자를 입력하시오  : ");
		int user = sc.nextInt();
		
		if(random ==1)
			System.out.println("컴퓨터는 가위를 냈습니다");
		else if(random ==2)
			System.out.println("컴퓨터는 바위를 냈습니다");
		else
			System.out.println("컴퓨터는 보를 냈습니다");
		
		switch(user) {
		case 1:
			System.out.println("당신은 가위를 냈습니다.");
			break;
		case 2:
			System.out.println("당신은 바위를 냈습니다.");
			break;
		case 3:
			System.out.println("당신은 보를 냈습니다.");
		}
		switch (user - random) {
		case 1 : case -2 :
			System.out.println("당신의 승리입니다.");
			break;					//break 잊지말고 써라!!!!!!!!!!!!!!!!
		case 2 : case -1 :
			System.out.println("컴퓨터의 승리입니다.");
			break;
		case 0 :
			System.out.println("무승부 입니다.");
		}
	}

}

package for01;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {

		//주사위 숫자 맞추기 게임, 사용자에게는 3번의 기회가 있고 랜덤으로 1~6까지의 숫자를 추출하여
		//사용자가 3회 전까지 숫자 맞추기
		//1. 랜덤 추출 2. for 3. 사용자로부터 숫자 입력받기 4. 맞으면 for문 나오기 5. 틀리면 for문 계속
		
		int random = (int)(Math.random()*6)+1;
		Scanner sc = new Scanner(System.in);
		for(int i=1; i<=3; i++) {	
			System.out.println("얼마일까요? : ");
			int dice = sc.nextInt();
			if(random == dice) {
				System.out.println("정답입니다!");
				break;
			}
			else {
				if(i==3)
					System.out.println("3번의 기회가 끝났습니다.");
				else
				System.out.println("틀렸습니다. 다시 입력하십시오 : ");
			}
		}
	}

}

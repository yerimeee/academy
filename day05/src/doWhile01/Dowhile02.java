package doWhile01;

import java.util.Scanner;

public class Dowhile02 {

	public static void main(String[] args) {

		//랜덤으로 1~100사이의 숫자를 추출
		// do 사용자가 랜덤 숫자를 맞히기
		//ex) 정답:30 사용자:67 hint! 67보다 작습니다! while(정답이 아닌 경우 반복)
		// 축하합니다 정답입니다 ?회 만에 정답을 맞췄습니다.
		
		int com = (int)(Math.random()*100)+1; //랜덤값 잘 파악해라!!
		Scanner sc = new Scanner(System.in);
		int user = 0;						//변수 정의 잘 해라!!! ", counter = 0;" 붙여서 써도 됨
		int counter = 0;
		do {
			System.out.println("1~100 숫자 입력: ");
			user = sc.nextInt();			//변수 정의 잘 해라22!!!
			if(user<com) {
			System.out.println("틀렸습니다. " + user + "보다 큽니다.");
			}
			else if (user>com) {
				System.out.println("틀렸습니다. " + user + "보다 작습니다.");
			}
			counter++;						//반복문 횟수 세는 거 어떻게 코딩하는지 알아둬라!!!
		} while(com != user);
		System.out.println("축하합니다!" + counter + "회 만에 정답을 맞췄습니다.");
		
	}

}

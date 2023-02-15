package arrayTwo02;

import java.util.Scanner;

public class ArrayTwo03 {

	public static void main(String[] args) {

		// 2행 3열 배열을 생성하고 사용자로부터 국영수 점수를 입력받아 넣기, 한 사람이 평균 70점 이상이면 합격 그렇지 않으면 불합격
		int[][] score = new int [2][3];
		Scanner sc = new Scanner(System.in);
		
		for(int i=0; i<score.length; i++) {
			int sum = 0;
			for(int j=0; j<score[i].length; j++) {
				System.out.println("점수 기입: ");
				score[i][j] =  sc.nextInt();	//입력받아 기입하는 법 알아둬라!!!
				sum += score[i][j];
			}
			//System.out.println("총점 : " + sum);
			//System.out.println("평균 : " + (double)sum/3);
			double avg = (double)sum/3;
			if(avg >= 70)
				System.out.printf("평균 : %.1f점입니다. 합격입니다.\n", avg);
			else
				System.out.printf("평균 : %.1f점입니다. 불합격입니다.\n", avg);
		}
	}
}

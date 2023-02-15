package arrayTwo02;

public class ArrayTwo02 {

	public static void main(String[] args) {

		int[][] score = {{90, 67, 78},
						{75, 32, 59},
						{23, 56, 80},
						{47, 55, 29},
						{100, 97, 86}};
		System.out.println("   국어   수학   영어   총점   평균   ");
		System.out.println("----------------------------------");
		//사람별 총점, 평균(소수점 첫째자리까지)을 구하시오
		int korSum=0;
		int mathSum=0;
		int engSum=0;
		for(int i=0; i<score.length; i++) {
			int sum = 0;		//for문의 바깥쪽에 쓰면 sum값이 학생들 모두와의 누적합이 돼버려서 안에 써야됨.
			
			korSum += score[i][0];
			mathSum	+= score[i][1];
			engSum += score[i][2];	//과목별 합계 구하기 방법2.
			
			for(int j=0; j<score[i].length; j++) {
			sum += score[i][j]; 
			//System.out.print(score[i][j] + " ");
			System.out.printf("%6d", score[i][j]); //6자리를 차지하기 때문에 가운데 정렬로 되어 출력됨.
			}
			System.out.printf("%6d",sum);		//출력문 어디에 둘 건지 잘 파악해
			System.out.printf(" %6.1f\n",(double)sum/3); //\n 안 넣어주면 줄바꿈 안 됨. printf형 외워라
			}
			System.out.printf("총점%5d%5d%5d\n", korSum,mathSum,engSum); //과목이 세개니까 %5d, 띄어쓰면 %6d가 된다
			System.out.printf("평균%5.1f%5.1f%5.1f\n", (double)korSum/5,(double)mathSum/5,(double)engSum/5); 
			//과목별 평균 구하기
			
		//과목별 합계를 구하시오. 방법1.
		System.out.println("----------------------------------");
		for(int i=0; i<3; i++) {
			int subject = 0;
			for(int j=0; j<score.length;j++) {
				subject += score[j][i];		//열이 바깥에서 돌고(i라는 소리) 행이 안에서 돌아서(j라는 소리) 저렇게 씀
			}
			System.out.printf("%6d",subject);
		}
	}

}

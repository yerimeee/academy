package arrayTwo02;

public class ArrayTwo01 {

	public static void main(String[] args) {

		int[][] score1 = new int[5][3];
		int[][] score2 = {{34,78,98},
						 {100,87,59,68}}; 	//자료 직접 넣을 때는 갯수를 자유롭게 조정 가능
		System.out.println(score2[0][2]);
		System.out.println(score2[1][1]);
		
		score1[1][2] =100;
		score1[0][1] =50;
		
		System.out.println("score2 배열의 (행)길이: " + score2.length); 
		System.out.println("score1 배열의 (행)길이: " + score1.length);
		
		System.out.println("score2 배열 [0]행의 열 길이: " + score2[0].length);
		System.out.println("score2 배열 [1]행의 열 길이: " + score2[1].length);
		
		int[][] score3 = {{34,78,98},
				 		 {100,87,59,98}};
		
		for(int i=0; i<score3.length; i++) {
			for(int j=0; j<score3[i].length; j++) {		//j<score3[i]인 이유는 각 행마다의 값이 나와야되니까 i
				System.out.print(score3[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------------");
		//2차원 배열 3행 5열, 값을 1~15까지 값을 넣고 출력하기
		int[][] num1 = new int[3][5];
		int num2 = 1;
		for(int i=0; i<num1.length; i++) {
			for(int j=0; j<num1[i].length; j++) {
				num1[i][j] = num2++;			//값 넣기 연습해라. 1. 변수 정수 설정 2. 변수의 상황에 맞는 변화
				System.out.print(num1[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}

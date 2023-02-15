package arrayTwo02;

public class ArrayTwo04 {

	public static void main(String[] args) {

		//1행은 5열, 2행은 3열, 3행은 7열
		int[][] num = new int[3][];
		num[0] = new int[5];
		num[1] = new int[3];
		num[2] = new int[7];
		
		int count = 1;
		for(int i=0; i<num.length; i++) {
			for(int j=0; i<num[i].length; j++) {
				num[i][j] = count++;
				System.out.print(num[i][j] + " ");
			}
			System.out.println();
		}
	}

}

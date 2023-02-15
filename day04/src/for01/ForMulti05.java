package for01;

public class ForMulti05 {

	public static void main(String[] args) {

		for(int i=1; i<=3; i++) {
			for(int j=9; j>=5; j--) {
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("=============");
		//중첩 for문으로 2~9단까지 나타내시오
		for(int i=2; i<=9; i++) {
			System.out.println(i+"단");
			for(int j=1; j<=9; j++) {
				System.out.println(i + "*" + j + "=" + i*j);
			}
			System.out.println(); //단과 단 사이의 줄바꿈 넣어주기 
		}
	}

}

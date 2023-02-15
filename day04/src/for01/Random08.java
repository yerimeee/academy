package for01;

public class Random08 {

	public static void main(String[] args) {

		double random = Math.random(); //난수 발생 : random() / 0.0 ~ 0.9999999999999999을 가짐. 그래서 double형.
				System.out.println(random);
				
		// 0.0 ~ 9.99999999를 출력하시오.
		random = Math.random()*10;
		System.out.println(random);
		
		//정수로 0 ~ 9 출력
		int random2 = (int)(Math.random()*10);
		System.out.println(random2);
		
		//정수로 1~10 출력
		random2 = (int)(Math.random()*10)+1;
		System.out.println(random2);
		
		//정수로 0~2 출력
		random2 = (int)(Math.random()*3); // 0.999999999 에 3 곱하면 2.7이라서.
		System.out.println(random2);
		
		//정수로 1~6 출력
		int random3 = (int)(Math.random()*6)+1;
		System.out.println(random3);
	}

}

package for01;

public class For03 {

	public static void main(String[] args) {

		// 1~100까지 홀수의 합
		int oddSum = 0;
		for(int i =1; i<=100; i+=2)
			oddSum += i;
		System.out.println("1~100까지 홀수의 합 : " + oddSum);
		
		// 1~100까지 짝수의 합
		int evSum = 0;
		for(int i = 2; i<=100; i+=2)
			evSum += i;
		System.out.println("1~100까지 짝수의 합 : " + evSum);
		
		/*또는
		 * int oddSum = 0;
		 * int evenSum = 0;
		 * for(int i=1; i<=100; i++) {
		 * 	if(i%2==0)
		 * 		evenSum += i;
		 * 	else
		 * 		oddSum += i;
		 * System.out.println("1개의 for문으로 짝수의 합 : " + evenSum);
		 * System.out.println("1개의 for문으로 홀수의 합 : " + oddSum);
		*/
	}

}

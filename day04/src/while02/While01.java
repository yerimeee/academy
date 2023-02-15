package while02;

public class While01 {

	public static void main(String[] args) {

		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		System.out.println("===========");
		
		int i =1;
		while(i<=10) {
			System.out.println(i);
			i++;
		}
		int sum =0;
		for(int j=1; j<=100; j++)
			sum += j;
		System.out.println(sum);
		
		sum = 0;
		int j =1;
		while(j<=100) {
			sum += j;
			j++;
		}
		System.out.println(sum);
	}

}

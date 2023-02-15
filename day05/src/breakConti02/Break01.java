package breakConti02;

public class Break01 {

	public static void main(String[] args) {
		// break는 반복문을 빠져 나온다.
		int sum =0, i =0;
		while(true) {
			if(sum > 100)
				break;
			i++;
			sum += i;
		}
			System.out.println("합계가 100이 넘는 순간은");
			System.out.println("1~" + i + "의 합계 = " + sum);
	}

}

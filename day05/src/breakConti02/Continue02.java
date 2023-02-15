package breakConti02;

public class Continue02 {

	public static void main(String[] args) {
		// continue : continue 뒷부분은 실행하지 않고 반복문으로 다시 간다.
		// 3의 배수를 제외한 1~100까지의 합계를 구하시오.
		int sum = 0;
		for(int i =1; i<=100; i++) {		//횟수가 정해져있는 거니까 for문 씀.
			if(i % 3 == 0)
				continue;
			sum += i;
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계: " + sum);
	}

}

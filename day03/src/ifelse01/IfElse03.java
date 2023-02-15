package ifelse01;

public class IfElse03 {

	public static void main(String[] args) {

		int score = 98;
		if(score >= 80)
			System.out.println("합격입니다.");
		else
			System.out.println("재평가대상입니다.");
		
		int num1 = 6785;
		if(num1 >= 1000)
			System.out.println("1000보다 큰 수 입니다.");
		else
			System.out.println("1000보다 작은 수 입니다.");
		
		if(num1 %2 ==0)
			System.out.println("짝수입니다.");
		else
			System.out.println("홀수입니다.");
	}

}

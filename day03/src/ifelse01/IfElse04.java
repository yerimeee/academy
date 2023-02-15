package ifelse01;

public class IfElse04 {

	public static void main(String[] args) {

		int score = 89;
		if(score >= 90)
			System.out.println("A학점");
		else if(score >= 80)
			System.out.println("B학점");
		else if(score >= 70)
			System.out.println("C학점");
		else if(score >= 60)
				System.out.println("D학점");
		else
			System.out.println("F학점");
		
		int month = 9;
		if(month>=3 && month<=5)
			System.out.println("봄입니다.");
		else if(month>=6 && month<=8)
			System.out.println("여름입니다.");
		else if(month>=9 && month<=11)
			System.out.println("가을입니다.");
		else if(month==1 || month==2 || month==12) //else를 넣으면 0을 넣거나 13을 넣으면 겨울로 지정됨.
			System.out.println("겨울입니다.");
		else
			System.out.println("1~12달만 존재합니다. 재입력하시오.");
	}

}

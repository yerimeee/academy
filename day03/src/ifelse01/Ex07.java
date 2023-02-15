package ifelse01;

public class Ex07 {

	public static void main(String[] args) {

		/*int month = 9;
		if(month>=3 && month<=5)
			System.out.println("봄입니다.");
		else if(month>=6 && month<=8)
			System.out.println("여름입니다."); //35도 이상이면 폭염경보, 40도 이상이면 폭염주의보
		else if(month>=9 && month<=11)
			System.out.println("가을입니다.");
		else if(month==1 || month==2 || month==12) 
			System.out.println("겨울입니다."); // -10도 이하이면 한파경보, -20도 이하이면 한파주의보 
		else
			System.out.println("1~12달만 존재합니다. 재입력하시오.");
		*/
		
		int month = 12;
		int temp = -25;
		
		if(month>=3 && month<=5)
			System.out.println("봄입니다.");
		else if(month>=6 && month<=8) {
			System.out.println("여름입니다.");
			if(temp >=35 && temp <40) 		//if(temp >= 40)을 먼저 써주면 논리연산자 필요없이
				System.out.println("폭염주의보");
			else if(temp >= 40)				//if(temp >= 35)를 써주면 됨. 40이 위에 있어서 먼저 조건에 걸리기 때문에
				System.out.println("폭염경보");
		} else if(month>=9 && month<=11)
			System.out.println("가을입니다.");
		else if(month==1 || month==2 || month==12) {
			System.out.println("겨울입니다.");			
			if(temp <= -10 && temp > -20)
				System.out.println("한파주의보");
			else if(temp <= -20)
				System.out.println("한파경보");
		}	else
			System.out.println("1~12달만 존재합니다. 재입력하시오.");
	}

}

package ifelse01;

import java.util.Scanner;

public class If02 {

	public static void main(String[] args) {

		//사용자로부터 영자(대소문자 중 하나) 또는 숫자(0~9까지만)를 입력받아 영자이면 문자입니다 숫자면 숫자입니다를 출력하시오.
		Scanner sc = new Scanner(System.in);
		System.out.println("입력하시오 : ");
		String st = sc.next(); //String은 객체(저장공간이 아니라 주소가 할당됨)라서 ==같은 연산자를 바로 쓸 수 없음.
		char ch = st.charAt(0); //charAt(0)를 이용하여 0은 맨첫번째 문자든지 숫자든지를 가져온다는 뜻.
		if((ch>='A' && ch <='Z') || (ch>='a' && ch<='z') )
			System.out.println("문자입니다.");
		if(ch >= '0' && ch <= '9')
			System.out.println("숫자입니다.");
	}

}

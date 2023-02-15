package for01;

public class For01 {

	public static void main(String[] args) {

		//반복문: 여러번 반복하여 수행하고자 할 때
		System.out.println("안녕하세요 KH정보교육원 입니다.");
		System.out.println("안녕하세요 KH정보교육원 입니다.");
		System.out.println("안녕하세요 KH정보교육원 입니다.");
		System.out.println("안녕하세요 KH정보교육원 입니다.");
		System.out.println("안녕하세요 KH정보교육원 입니다.");
		
		String str = "안녕하세요 KH정보교육원 입니다.";
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		System.out.println(str);
		
		System.out.println("==============");
		for(int i = 1; i<=5; ++i) {				//for문도 수행문이 한 줄이면 중괄호 안 써도 됨.
												// i++, ++i 연산하는게 아니어서 앞에 오든 뒤에 오든 상관ㄴㄴ 
			System.out.println("안녕하세요 KH정보교육원 입니다.");
		}
		System.out.println("==============");
		for(int j = 1; j<=5; j++) {
			System.out.println(str);
		}
		for(int i=1; i<=5; i++)
			System.out.println(i + ".하이하이");
	}

}

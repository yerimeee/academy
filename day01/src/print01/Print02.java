package print01;

public class Print02 {

	public static void main(String[] args) {
		//문자열에서 + 연결기호, 숫자에서는 연산자
		System.out.println(5+3 + " : 5+3의 연산결과 출력");
		
		System.out.println("5+3의 연산결과 : " + 5+3); //시작을 문자로 했다면 +,- 쓰고 숫자를 써도 문자로 인식함.
		System.out.println("5+3의 연산결과 : " + (5+3)); // 괄호 넣으면 연산 가능
		System.out.println("5+3의 연산결과 :" + (5-3));
		
		// *,/ 은 상관없음
		System.out.println("5*3의 연산결과 : " + 5*3);
		System.out.println("5/3의 연산결과 : " + 5/3);
		
	}

}

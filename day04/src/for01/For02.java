package for01;

import java.util.Scanner;

public class For02 {

	public static void main(String[] args) {

		//1.안녕하세요 
		//3.안녕하세요 
		//5.안녕하세요
		//... 를 출력하려면?
		
		for(int i=1; i<=100; i+=2) //i=i+2
			System.out.println(i + ".안녕하세요");
		//또는
		int num = 1;
		for(int i=1; i<=100; i++) {
			System.out.println(num + ".안녕하세요");
			num += 2;
		}
		System.out.println("============");
		
		for(int i=50; i>=1; i--)
			System.out.println(i+".안녕");
		
		// 1~100까지 누적 합계를 구하시오
		int sum = 0;				//for문 밖에 써줘야 stack메모리의 int값이 0으로 초기화가 돼서 누적합이 안 됨!
		//int i = o;  // i값을 출력하고 싶으면 이렇게 밖에 쓰고
		for(int i = 1; i<=100; i++) {			//for문 안에 있는 i를 지역변수라고 함.
			sum = sum + i;
			System.out.println(sum); //만약 sum의 맨 마지막 값(5050)만 알고 싶으면 출력문을 for문 괄호 밖으로 쓰면 됨
		}
		//System.our.println(i); 해주면 i값 출력
		
		/*Scanner scan = new Scanner(System.in); //밖에 쓰면 밑에서도 재사용 가능
		for(int j=0; j<=5; j++) {
			System.out.println("이름 입력: ");
			String name = scan.next();
			System.out.println("당신의 이름은 " + name + "입니다.");
		}
		
		for(int j=1; j<=3; j++) {
			System.out.println("첫번째 숫자 입력: ");
			int num1 = scan.nextInt();
			System.out.println("두번째 숫자 입력: ");
			int num2 = scan.nextInt();
			
			System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
		}
		*/
		//사용자로부터 두 숫자와 연사자를 입력받아 연산한 결과를 출력(3번 반복)
		Scanner sc = new Scanner(System.in);
		for(int j = 1; j<=3; j++) {
			System.out.println("첫 숫자 : ");
			int number = sc.nextInt();
			System.out.println("두번째 숫자 : ");
			int number2 = sc.nextInt();
			System.out.println("연산자 : ");
			String str = sc.next();
			
			switch(str) {
			case "+":
				System.out.println(number + str + number2 + "=" + (number+number2));
				break;
			case "-":
				System.out.println(number + str + number2 + "=" + (number-number2));
				break;
			case "*":
				System.out.println(number + str + number2 + "=" + (number*number2));
			case "/":
				System.out.println(number + str + number2 + "=" + ((double)number/number2));
				break;
			case "%":
				System.out.println(number + str + number2 + "=" + (number%number2));
				break;
				default :
					System.out.println("잘못입력하셨습니다.");
			}
			/* 또는 
			 * char ch = str.charAt(0);
			 * if(ch =='+')
			 * System.out.println(number + str + number2 + "=" + (number+number2));
			 * else if(ch == '-')
			 * System.out.println(number + str + number2 + "=" + (number-number2));
			 */
		}
	}

}

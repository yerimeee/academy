package scanner03;

import java.util.Scanner;

public class Scanner1 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		
		// next:단어단위의 문자열로 가져온다. = 단어단위로 나오기 때문에 처음 넣은 단어만 출력됨. 여러 이름 넣어봤자 안 나옴.
		/*
		 * System.out.print("이름을 입력하세요 : ");
		 * String str = scan.next(); 
		 * System.out.println("당신의 이름은 " + str + "입니다!");
		 */
		
		// nextLine:한 줄 단위로 읽어옴.
		/*
		 * System.out.print("주소를 입력하세요 : "); 
		 * String str2 = scan.nextLine();
		 * System.out.println("주소 : " + str2);
		 */
		
		/*
		 * System.out.print("첫번째 숫자를 입력하세요 : "); 
		 * int num1 = scan.nextInt(); //int가 들어가야할
		 * 저장 공간이 필요하기 때문에 int num1 할당해줌. 
		 * System.out.print("두번째 숫자를 입력하세요 : "); 
		 * int num2 = scan.nextInt();
		 * 
		 * System.out.println( num1 + "+" + num2 + "=" + (num1 + num2));
		 */
		
		/*
		 * System.out.print("첫 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));
		*/
		
		/*
		 * System.out.print("첫 숫자 : "); 
		 * int num1 = scan.nextInt();
		 * System.out.print("두번째 숫자 : "); 
		 * int num2 = scan.nextInt();
		 * 
		 * System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));
		 */
		
		System.out.print("첫 숫자 : ");
		int num1 = scan.nextInt();
		System.out.print("두번째 숫자 : ");
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "/" + num2 + "=" + (num1 / num2));
		
	}

}

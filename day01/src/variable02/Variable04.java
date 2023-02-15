package variable02;

public class Variable04 {

	public static void main(String[] args) {

		System.out.printf("%d\n", 5); // %d는 정수형으로 대입을 하라는 뜻.
		int num = 10;
		System.out.printf("%d\n", num);
		
		System.out.printf("%f\n", 3.1545);
		System.out.printf("%c\n", 'b');
		System.out.printf("%s\n", "abcdef");
		
		System.out.println("========");
		
		System.out.format("%d\n", 5); // format = printf 둘이 똑같은 형식
		num = 10;
		System.out.format("%d\n", num);
		
		System.out.format("%f\n", 3.1545);
		System.out.format("%c\n", 'b');
		System.out.format("%s\n", "abcdef");
		System.out.println("===========");
		
		System.out.printf("%o\n", 9); // %o는 8진수로 바꾸라는 뜻. 16진수는 %x
		System.out.printf("%x\n", 15);
		System.out.printf("%X\n", 15);
		
		// %6.4f: 전체 자리수는 6개까지, 소수점 다섯째자리에서 반올림 한다는 뜻
		System.out.printf("%6.4f\n", 1.234567); 
		System.out.format("%7.4f\n", 12.34567);
		
		// 가장 많이 사용하는 출력 문법, 앞 정수부분은 어떻든 상관없고 소수점 세번째 자리까지만 나타낸다는 뜻
		System.out.printf("%.3f", 1435.345678); 
	}

}

package operator03;

public class Operator01 {

	public static void main(String[] args) {
		//단항 연산자 / 이항 연산자 / 삼항 연산자		 / 대입 연산자
		// ++ , -- / 		/ 10 == 5 ? 1 : 0 / int a = 10
		
		int num1 = 10;
		num1++; //하나를 증가시키라는 뜻.
		System.out.println(num1);
		++num1;
		System.out.println(num1);
		
		num1--;
		System.out.println(num1);
		--num1;
		System.out.println(num1);
		
		//++,--이 앞에 붙으면 우선순위가 가장 높다
		int num2= 10;
		int result = ++num1 + ++num2;
		System.out.println(result);
		
		/*
		 * num1 = 10; num2 = 10;
		 */
		//++,--이 뒤에 붙으면 우선순위가 가장 높다
		num1 = num2 = 10;
		result = num1++ + num2++;
		System.out.println(result);
		
		num1 = num2 = 10;
		result =  num1++ + ++num2;
		System.out.println(result);
		
		num1 = num2 = 10;
		result = ++num1 + num2--;
		System.out.println(result);
		
		int n1, n2, n3;
		int n4=10, n5=20, n6=30;
		n1=n2=n3=10;
		
		result = ++n1 + n2-- - --n3;
		//12	11		10		9
		System.out.println(result);	
		
		n1=n2=n3=10; //초기화 작업 있어야 할당값 리셋됨!!!! 안 그럼 위에 식의 값에서 이어서 계산하는 거임.
		result = n1++ * ++n2 + n3++;
		//120	10		11		10	
		System.out.println(result);
		System.out.println("==========");
		
		n1=n2=n3=10;
		System.out.println(++n1);
		System.out.println(n2++);
		System.out.println(n2); //위 계산의 영향으로 11이 나오게 됨.
	}

}

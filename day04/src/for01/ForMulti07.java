package for01;

public class ForMulti07 {

	public static void main(String[] args) {

		for(int i=1, j=10; i<=10; i++, j--) {			//변수가 여러개일 때 조건식은 항상 하나만 씀!
			System.out.println("i=" + i + ", j=" + j);
		}
		System.out.println("==========");
		
		int num1 = 10;
		for(;;) {
			num1++;
			System.out.println(num1);
			if(num1 == 20)
				break;		 // 반복문 사용할 때 멈추고 싶은 조건에서 사용
		} 
	}

}

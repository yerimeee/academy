package array04;

public class Array01 {

	public static void main(String[] args) {

		int num1=0, num2=1, num3=2, num4=3, num5=4;
		
		//나중에 값을 넣고자 할 때는 new키워드로 생성하면서 메모리 자리 확보를 위해 반드시 갯수를 넣어줘야 함.
		int[] arr1 = new int[5]; //가로로 길쭉한 배열에 5개의 int(4byte)가 나눠서 만들어지고
								// stack 메모리에 arr1의 객체가 생기고 주소가 할당 됨. 
		int arr2[] = new int[10]; // 배열표시 대괄호[]는 자료형 또는 변수명 어디에 붙여도 상관ㄴㄴ
		
		double[] douArr = new double[10];
		
		// int[] a = new int[5] {1,2,3}; 자리값이랑 자료값 개수가 안 맞으면 안 됨.
		int[] arr3 = {10,20,30,40,50}; //자리를 만들면서 곧바로 자료를 넣고 싶을 때 중괄호 이용. 자바가 알아서 3개의 자리를 만들어 넣음
		char[] chArr = {'a','b','c','d','e'};
		boolean[] boolArr = {true, false, false, true, false};
		String[] strArr = {"이순신", "아무개", "홍길동"};
		
		System.out.println(arr3[0]); // 1개 출력시 index번호(0부터 시작)를 이용하여 출력. 결과값: 10
		//배열의 모든 값 출력
		for(int i=0; i<=4; i++) {
			System.out.print(arr3[i] + " ");
		}
		System.out.println();
		System.out.println("----------------");
		
		// 배열에 값 넣기
		arr1[0] = 15;
		arr1[2] = 25;
		arr1[4] = 35;
		System.out.println(arr1[0] + " " + arr1[2]);
		System.out.println(arr1[1]);
		
		for(int i=0; i<5; i++)
			System.out.print(arr1[i]+ " ");
		System.out.println();
		System.out.println("-----------------");
		
		//규칙이 있는 값을 배열에 넣기
		for(int i=0; i<10; i++) {
			arr2[i] = i+1;
			System.out.print(arr2[i] + " ");
		}
		System.out.println();
		System.out.println("-----------------");
		
		//정수형 배열 10개를 생성한 배열에
		//random으로 1~100까지 추출하여 10개의 배열에 넣어 출력하시오.
		int[] arr4 = new int[10];
		for(int j=0; j<10; j++) {
			arr4[j] =(int)(Math.random()*100)+1; // 랜덤변수 따로 안 만들고 바로 대입가능
			System.out.print(arr4[j]+ " ");		// 가로로 출력할 거면 ln 조심해라!!!!
		}
	}

}

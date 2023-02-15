package array04;

import java.util.Arrays;

public class Array04 {

	public static void main(String[] args) {

		int[] arr1 = {12, 46, 98, 10, 54, 32, 26};
		System.out.println(Arrays.toString(arr1));
		
		char[] chArr = {'a','b','c','d','e'};
		boolean[] boolArr = {true, false, false, true, false};
		String[] strArr = {"이순신", "아무개", "홍길동"};
		double dArr[] = {10.12, 12.56, 23.46, 54.674};
		
		System.out.println(Arrays.toString(boolArr));
		System.out.println(chArr);	//String이 char 기반으로 만들어졌기 때문에 주소 아니고 값이 나옴
		System.out.println(dArr);
	}

}

package arrayMethod02;

import java.util.Arrays;

public class ArrayMethod01 {

	public static void main(String[] args) {

		int[] num = { 3, 6, 8, 10, 75};
		int[] result = new int[10];
		
		for(int i=0; i<num.length; i++) {
			result[i] = num[i];		
		}
		System.out.println(Arrays.toString(result));
		
		//Arrays 클래스의 method 사용
		int[] re2 = Arrays.copyOf(num, 3);
		System.out.println(Arrays.toString(re2));
		
		int[] re3 = Arrays.copyOfRange(num, 1, 4);
		System.out.println(Arrays.toString(re3));
		
		// System 클래스의 method 사용
		int[] re4 = new int[10]; 
		System.arraycopy(num, 2, re4, 3, 2);
		System.out.println(Arrays.toString(re4));
	}

}

package array04;

public class Array03 {

	public static void main(String[] args) {
		//최대값과 최소값 구하기
		int[] arr1 = {12, 46, 98, 10, 54, 32}; 
		int max = arr1[0]; //위치 0값과 하나하나 다 비교해서 크면 큰 수로 다시 대입, 작으면 작은 수로 다시 대입 하면 도출되겠죠ㅎ
		int min = arr1[0];
		for(int i=1; i<arr1.length; i++) {
			if(max < arr1[i])
				max = arr1[i];
			
			if(min > arr1[i])
				min = arr1[i];
		}
		System.out.println("최대값: " + max);
		System.out.println("최소값: " + min);
	}

}

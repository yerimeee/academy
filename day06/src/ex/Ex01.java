package ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {

		// 주민등록번호를 입력받아('-'대시 포함) 개수가 14자리가 맞는지 확인하고
		// 성별숫자(1234)까지만 보여지고 그 후로는 별 표시하시오 아니면 다시 입력하세요 출력
		
		int[] num = new int[13];
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("주민번호를 -포함 입력하시오: ");
			String id = sc.next();
			if(id.length() == 14) {
				char gender = id.charAt(7);
				if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {
					System.out.println(id.substring(0,8) + "******"); //8번 위치 바로 직전까지 가져오는 거라서 8
					break;
				}
			}else
				System.out.println("잘못된 형식입니다. 다시 입력하십시오");
		}
		System.out.println("주민번호가 입력됨.");
	}

}

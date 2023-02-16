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
			String id = sc.next();		//int로 못하는 이유는 우리가 주민번호 하나하나를 추출해야되는데 int는 주민번호가 1234일때 1234로 읽히고 
										//문자열은 1,2,3,4로 읽어올 수 있기 때문에. 만약 여기서 int를 쓰게 되면 배열 하나하나를 다 int형으로 변환시켜 가져와야함.
			if(id.length() == 14) {
				char gender = id.charAt(7);
				if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {		//이것도 int형으로 쓰게 되면 못하는 거임.
					System.out.println(id.substring(0,8) + "******"); //8번 위치 바로 직전까지 가져오는 거라서 8
					break;
				}
			}else
				System.out.println("잘못된 형식입니다. 다시 입력하십시오");
		}
		System.out.println("주민번호가 입력됨.");
	}
	
	/* String[] id = new String[5];
	 * for(int i=0; i<id.length; i++) {			//얘는 저장공간이라 id.length에 괄호()안 붙음
	 * 	System.out.println("주민번호를 -포함 입력하시오: ");
	 * 	id[i] = sc.next();
	 * 	
	 * 	if(id[i].length() == 14) {		//얘는 메서드라서 괄호 있음()
	 * 	char gender = id[i].charAt(7);
		if(gender=='1' || gender=='2' || gender=='3' || gender=='4') {
			id[i] = id[i].substring(0,8) + "******";
			continue;		//5번을 돌아줘야되니까 참이어도 for문을 돌아야해서 continue
	 * 	 }
	 * } else{
			System.out.println("잘못된 형식입니다. 다시 입력하십시오");
			i--;
		 }
	 *  } else{
			System.out.println("잘못된 형식입니다. 다시 입력하십시오");
			i--;
		 }
	 * 	System.out.println("주민번호가 입력됨.");
	 *  System.out.println(Arrays.toString(student));
	 */

}

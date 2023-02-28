package exception01;

public class _04_NumberFormatException {

	public static void main(String[] args) {
		String[] strNum = {"23", "17", "3.141592"};
		int i = 0;
		try {
		for(i=0; i<strNum.length; i++) {	//위에 i값 초기화해줬기 때문에 int 안 붙이고 i=o부터 시작하라고 함.
		int x = Integer.parseInt(strNum[i]); //(int)strNum 안됨. 객체타입을 기본타입으로 바꾸는 것이기 때문에. 기본-기본끼리는 됨.
		System.out.println(x);
			}
		} catch(NumberFormatException e) {
			System.out.println(strNum[i] + "는 실수이기에 정수로 변환할 수 없습니다.");
		}
	}

}

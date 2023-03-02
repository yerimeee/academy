package langPackage03.stringMethod01;

public class _02_StringEx2 {

	public static void main(String[] args) {
		// charAt() : 인덱스 번호에 해당하는 문자 1개를 반환
		String str = "123456-2234567";
		char ch1 = str.charAt(7);
		switch(ch1) {
		case '1' : case '3' :
			System.out.println("남성");
			break;
		case '2' : case '4' :
			System.out.println("여성");
		}
	}

}

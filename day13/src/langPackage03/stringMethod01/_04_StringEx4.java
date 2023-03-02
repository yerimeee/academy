package langPackage03.stringMethod01;

public class _04_StringEx4 {

	public static void main(String[] args) {
		String ssn = "1234567890123";
		//int length = ssn.length();
		if(ssn.length() == 13)
			System.out.println("주민번호 자리 수가 맞습니다");
		else
			System.out.println("주민번호 자리수가 아닙니다");
	}

}

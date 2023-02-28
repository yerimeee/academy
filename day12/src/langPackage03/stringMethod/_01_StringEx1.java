package langPackage03.stringMethod;

public class _01_StringEx1 {

	public static void main(String[] args) {
		int num = 10;
		String strNum = String.valueOf(num);	//num을 문자열로 바꿔 strNum에 넣어라
		System.out.println(strNum);
		
		String strNum2 = num + "";	// valueOf 안 쓰고 num이 문자열로 인식됨
		System.out.println(strNum + strNum2);
		
	}

}

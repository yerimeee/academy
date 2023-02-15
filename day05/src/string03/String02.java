package string03;

public class String02 {

	public static void main(String[] args) {

		//String(참조자료형)을 기본자료형(Byte, Short, Integer)으로 변환
		String str = "30";
		int num = Integer.parseInt(str);
		System.out.println(num + 10); //숫자형이라 40
		System.out.println(str + 10); //문자열이라 3010
		byte b1 = Byte.parseByte(str);
		
		String str2 = "15.678";
		double d1 = Double.parseDouble(str2);
		
		String str3 = "true";
		boolean bool = Boolean.parseBoolean(str3);
		
		// String.valueOf : 기본형을 String(참조자료형)으로 변환
		int num2 = 50;
		String str4 = String.valueOf(num2);
		System.out.println(str4 + 100); //문자열로 바꿔줬으니 50100
	}

}

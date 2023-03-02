package langPackage03.stringMethod01;

public class _08_StringEx8 {

	public static void main(String[] args) {
		String str1 = "JAVA Program";
		
		String strLower = str1.toLowerCase();
		System.out.println(str1);	//원본이 바뀌는 것이 아님!
		System.out.println(strLower);
		
		String str2 = strLower.substring(0, 1).toUpperCase() + strLower.substring(1, 5) + strLower.substring(5, 6).toUpperCase() + strLower.substring(6);
		System.out.println(str2);
		
		String strUpper = str1.toUpperCase();
		System.out.println(strUpper);
	}

}

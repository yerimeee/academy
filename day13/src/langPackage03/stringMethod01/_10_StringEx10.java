package langPackage03.stringMethod01;

public class _10_StringEx10 {

	public static void main(String[] args) {
		String str1 = "java";
		String str2 = "JAVA";
		
		System.out.println(str1.equals(str2));	//대소문자 다르기 때문에 false
		System.out.println(str1.equalsIgnoreCase(str2));	//대소문자 구분없어서 True
		
	}

}

package langPackage03.stringMethod01;

public class _09_StringEx9 {

	public static void main(String[] args) {
		String str1 = "java        ";
		System.out.println(str1 + "공백제거 전");
		System.out.println(str1.trim() + "공백제거 후");
		
		String str2 = "   program   ";
		String str3 = "   입문";
		System.out.println(str1.trim() + str2.trim() + str3.trim());
		
		String str4 = "   java  program  입문   ";
		System.out.println(str4.trim() + ":양끝 공백만 제거");
	}

}

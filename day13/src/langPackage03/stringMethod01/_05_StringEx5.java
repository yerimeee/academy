package langPackage03.stringMethod01;

public class _05_StringEx5 {

	public static void main(String[] args) {
		//replace : 글자 치환
		String str = "javaprogram java kimjava leejava";
		String newStr = str.replace("java", "자바");
		System.out.println(newStr);
		
		newStr = str.replace("j", "oi");
		System.out.println(newStr);
		
		// str.replace('j', 'm'); 이건 한 글자만 바꾸는 건데 별로 사용 안 함
		
		newStr = str.replaceFirst("a", "b"); //맨 앞에 있는 a만 치환
		System.out.println(newStr);
	}

}

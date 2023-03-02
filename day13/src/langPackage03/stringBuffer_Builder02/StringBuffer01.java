package langPackage03.stringBuffer_Builder02;

public class StringBuffer01 {

	public static void main(String[] args) {
		//StringBuffer는 무조건 객체 생성 해줘야됨!!!
		StringBuffer sb1 = new StringBuffer("abc");
		StringBuffer sb2 = new StringBuffer("abc");
		
		//equals()를 오버라이딩 하지 않았음 : 주소가 같은가를 물어봄
		System.out.println("sb1 == sb2 ? " + (sb1 == sb2));
		System.out.println("sb1.equals(sb2) ? " + sb1.equals(sb2));
		
		// String은 sb2 = sb1 + "def"; 이렇게하면 넣어졌지만 Buffer는 안 됨. 그래서 append 사용
		sb1.append("def");
		System.out.println("sb1 출력: " + sb1);
		sb1.append("... 알파벳");
		System.out.println("sb1 출력: " + sb1);
		
		sb2.append("def... 알파벳");
		String str = sb1.toString();	// = new String(sb1);과 같음
		String str2 = sb2.toString();
		System.out.println(str.equals(str2));	
		//String으로 변환했기 때문에 안에 들어있는 값이 같은지 볼 수 있음
	}

}

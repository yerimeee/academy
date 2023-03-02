package langPackage03.stringBuffer_Builder02;

public class StringBuffer02 {

	public static void main(String[] args) {
		StringBuffer  sb = new StringBuffer("010");
		System.out.println("capacity: " + sb.capacity());
		// 16Byte(Buffer의 기본값) + 010의 3Byte = 19Byte ->이거 걍 그렇구나하고 넘기삼 
		
		//맨 뒤에 추가
		sb.append("1111");
		System.out.println(sb);
		
		//원하는 인덱스에 추가
		sb.insert(3, "-");
		System.out.println(sb);
		
		//index값 문자 삭제
		sb.deleteCharAt(3);
		System.out.println(sb);
		
		//시작 index ~ 끝 index 직전까지 삭제
		sb.delete(0, 3);
		System.out.println(sb);
		
		// 원하는 위치의 값을 다른값으로 변경
		sb.replace(2, sb.length(), "22");
		System.out.println(sb);
		
		//문자열 거꾸로
		sb.reverse();
		System.out.println(sb);
	}

}

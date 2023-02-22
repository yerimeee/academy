package varargs05;

public class VarargsTest {

	public static void main(String[] args) {

		int[] a = {100, 200, 300, 400, 500};
		for(int i=0; i<a.length; i++)
			System.out.println(a[i]);
		System.out.println("----------------------");
		
		for(int b:a)	//자바에서만 배열일 때 사용할 수 있는 반복문. 첨부터 끝까지 싹 다 돌 수 있음
			System.out.println(b);
		System.out.println("----------------------");
		
		System.out.println(con("a", "b", "c", "d"));
		System.out.println(con2("-", "a", "b", "c", "d"));
	}
	static String con(String...strs) {	//...은 알아서 배열에 들어감. 보통 복수형이라 변수명에 s붙여줌, 0개~무한대까지 문자열을 받을 수 있다.
		String result = "";
		for(String arst : strs) {
			result += arst + " ";
		}
		return result;
	}
	static String con2(String format1, String...strs) {	// (String format1, 의 형식은 무조건 인자를 1개 이상 입력해줘야 함.
		String result = "";
		for(String arst : strs) {
			result += arst + format1;
		}
		return result;
	}
	

}

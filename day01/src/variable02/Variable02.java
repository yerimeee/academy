package variable02;

public class Variable02 {

	public static void main(String[] args) {

		int x =10;
		double pi = 3.141519;
		char ch = 'a';	// 반드시 한 글자만, 외따옴표
		boolean bool = false;
		String str = "abcdf"; // 한 글자도 되고 아예 안 넣어도 됨, 쌍따옴표
		
		System.out.println(x);
		System.out.println(pi);
		System.out.println(bool);
		System.out.println(str);
		System.out.println("=========");

		bool = 50 > 40;
		System.out.println(bool);
		
		System.out.println("=========");
		long long1 = 123456789034567L; //long형은 반드시 뒤에 식별자 L을 붙여줌. 안 그러면 int로 인식해서 비트량이 많아져서 오류남.
		float f1 = 45.372F; // float형은 뒤에 식별자 F를 붙여줌.
		
	}

}

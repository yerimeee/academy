package langPackage03;

public class _01_Equals {

	public static void main(String[] args) {
		//String에서의 객체 생성
		String str = "a";
		String str2 = "a";	//new를 따로 안 쓰고 값이 같으면 같은 객체를 가리킴
		System.out.println("주소가 같은가? " + (str == str2));
		
		String str3 = new String("a");
		String str4 = new String("a"); //얘넨 주소 다른 객체들이 따로 생성
		System.out.println("주소가 같은가? " + (str3 == str4));
		
		//Class에서의 객체 생성
		Value v1 = new Value(5);	
		Value v2 = new Value(5);	//무조건 new써야 객체 생성됨
		System.out.println("v1과 v2 주소가 같은가? " + (v1 == v2));
		
		// String에서는 equals를 오버라이딩 했기 때문에 값 비교가 가능
		if(str3.equals(str4))	
			System.out.println("str3과 str4 값이 같습니다.");
		else
			System.out.println("str3과 str4 값이 다릅니다.");
		
		//java.lang에 있는 equals()메소드는 주소가 같은가를 비교함 
		if(v1.equals(v2))
			System.out.println("v1과 v2 값이 같습니다.");
		else
			System.out.println("v1과 v2 값이 다릅니다.");
	}

}

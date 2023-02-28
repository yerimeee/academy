package exception01;

public class _09_Throws {

	public static void main(String[] args) {
		try {
			findClass();
			System.out.println("클래스 있음");
		} catch (ClassNotFoundException e) {
			System.out.println(e.getMessage() + " 클래스 없음");
		}
	}
	static void findClass() throws ClassNotFoundException { //객체 생성 안 하고 쓰려고 static
		Class class2 = Class.forName("java.lang.String2"); //그냥 class만 쓰면 java의 클래스라서 오류남
	}
}

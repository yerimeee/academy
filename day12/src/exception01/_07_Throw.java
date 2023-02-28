package exception01;

public class _07_Throw {

	public static void main(String[] args) { //throws Exception { 너가 알아서 try~catch문 해줘라
		try {
		Exception e = new Exception("고의로 예외 발생");
		throw e;
		} catch(Exception e) {
			//e.printStackTrace(); =>오류났던 거 나옴
			System.out.println("예외 메세지: " + e.getMessage());
		}
		System.out.println("프로그램 정상 종료");
	}

}

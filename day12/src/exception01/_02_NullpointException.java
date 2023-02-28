package exception01;

public class _02_NullpointException {

	public static void main(String[] args) {
		try {
		String data = null;
		System.out.println(data.toString());
		}catch(NullPointerException e) {
			System.out.println("데이터가 없습니다.");
			System.out.println("메세지: " + e);
		}
	}

}

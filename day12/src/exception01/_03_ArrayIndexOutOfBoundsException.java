package exception01;

public class _03_ArrayIndexOutOfBoundsException {

	public static void main(String[] args) {
		String[] str = {"a", "b", "c"};
		try {
		str[1] = "d";
		str[6] = "e";	//오류인데 빨간 밑줄 안 생김. 실행 때 오류남.
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 넘어섰습니다.");
		}
	}

}

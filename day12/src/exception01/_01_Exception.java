package exception01;

public class _01_Exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		try {
			//예외가 발생할 상황을 넣어줌
			int result = 5/0;
			//예외가 발생하지 않으면 밑에 것 처리
			System.out.println(3);
			System.out.println(4);
		} catch(Exception e) {	//모든 예외를 다 넣을 수 있음
			//예외가 발생했을 때 처리할 것을 넣어줌
			System.out.println("0으로 나눌 수 없습니다.");
			System.out.println(5);
		}
		System.out.println(6);
	}

}

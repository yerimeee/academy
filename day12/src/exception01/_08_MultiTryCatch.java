package exception01;

public class _08_MultiTryCatch {

	public static void main(String[] args) {
		String[] str = {"a", "b", "c"};
		String[] strNum = {"23", "17", "3"};
		int i = 0;
		
		try {
			str[1] = "d";
			str[2] = "e";	
			
			for(i=0; i<strNum.length; i++) {	
				int x = Integer.parseInt(strNum[i]);
				System.out.println(x);
			}
			
			int num = 9/0;
			
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 크기를 넘어섰습니다.");
		} catch(NumberFormatException e) {
					System.out.println(strNum[i] + "는 실수이기에 정수로 변환할 수 없습니다.");
		} catch(ArithmeticException e) {
					System.out.println(e.getMessage());
		}catch(Exception e) {	//Exception은 모든 에러를 가지기 때문에 맨 위에 적으면 밑에 다른 catch문은 오류남
			System.out.println(e.getMessage());
		} finally {	//try~catch 다 끝나고 나서 무조건 실행문, 어차피 println 따로 쓰면 돼서 잘 안 쓰긴 함
		System.out.println("프로그램 종료");
		}
	}

}

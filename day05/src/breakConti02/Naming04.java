package breakConti02;

public class Naming04 {

	public static void main(String[] args) {

		Stop1 : for(int i=1; i<=3; i++) {
			for(int j=1; j<=3; j++) {
				if(i ==2)
					break Stop1;	//for문에 이름 붙여주고 break,continue 지정해주면 해당 for문 빠져나올 수 있음.		
				System.out.println("i=" + i + ", j=" + j);
			}
		}
		System.out.println("밖의 for문 종료");
	}	

}

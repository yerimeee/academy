package langPackage03.stringMethod01;

public class _06_StringEx6 {

	public static void main(String[] args) {
		String str = "공공데이터 융합 웹 애플리케이션 개발자 양성과정2";
		System.out.println(str.substring(6, 8)); 
		System.out.println(str.substring(9));
		
		//올해 몇살? 생일은? 성별은?
		String sn = "041121-3789760";
		int age = Integer.parseInt(sn.substring(0, 2));
		System.out.println("나이는 " + (2023 - (age + 2000)) + "살 입니다." );
		System.out.println("생일은 " + sn.substring(2, 4) + "월 " + sn.substring(4, 6) + "일 입니다.");
		String gender = sn.substring(7,8);
		switch(gender) {
		case "1" : case "3" :
			System.out.println("남성입니다");
			break;
		case "2" : case "4" :
			System.out.println("여성입니다");
		}
		
	}

}

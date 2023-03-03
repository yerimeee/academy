package langPackage03.Math03;

public class Math01 {

	public static void main(String[] args) {
		// 절대값
		System.out.println("-11의 절대값: " + Math.abs(-11));
		System.out.println("-11.13의 절대값: " + Math.abs(-11.13));
		System.out.println("-----------------------");
		
		// 소수점 이하 무조건 올림
		System.out.println("13.1의 올림: " + Math.ceil(13.1));
		System.out.println("-13.1의 올림: " + Math.ceil(-13.1));
		System.out.println("-----------------------");
		
		// 소수점 이하 무조건 내림
		System.out.println("13.8의 내림: " + Math.floor(13.8));
		System.out.println("-13.8의 내림: " + Math.floor(-13.8));
		System.out.println("-----------------------");
		
		//가장 가까운 정수값 반환
		System.out.println(Math.rint(13.1));
		System.out.println(Math.rint(13.9));
		System.out.println(Math.rint(-13.1));
		System.out.println(Math.rint(-13.9));
		System.out.println("-----------------------");
		
		//소수점 이하 반올림
		System.out.println(Math.round(13.6));
		System.out.println(Math.round(13.1));
		System.out.println(Math.round(-13.6));
		System.out.println(Math.round(-13.1));
		System.out.println("-----------------------");
		
		//둘 중 큰 수, 작은 수
		System.out.println("7과 8중 큰 숫자: " + Math.max(7, 8));
		System.out.println("7과 8중 작은 숫자: " + Math.min(7, 8));
		System.out.println("7.345와 7.545중 큰 숫자: " + Math.max(7.345, 7.545));
		System.out.println("7.345와 7.545중 작은 숫자: " + Math.min(7.345, 7.545));
		System.out.println("-----------------------");
		
		// 소수점 원하는 자리까지 얻기
		double value = 12.34567;
		double value2 = value * 100;
		System.out.println(value2);
		double value3 = Math.round(value2);
		System.out.println(value3);
		System.out.println(value3/100);
		//위에것들은 잘 안 쓰고 거의 밑에 거 사용
		System.out.printf("%.2f", 89.45678);
	}

}

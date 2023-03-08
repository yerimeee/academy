package decimalFormat01;

import java.text.DecimalFormat;	//ctrl+shift+O 하면 임포트 됨
import java.text.ParseException;

public class DecimalFormat1 {

	public static void main(String[] args) {
		double number = 12344567.89;
		DecimalFormat df = new DecimalFormat(".0"); //소수점 출력하고 싶으면 .추가
		System.out.println(df.format(number));
		df.format(123.789);	//format은 원하는 숫자를 넣든가 변수를 넣든가 상관x
		// new DecimalFormat(".0").format(123.789); 
		
		System.out.println(new DecimalFormat("0").format(4758.948));
		System.out.println("-----------------------------------");
		
		System.out.println(new DecimalFormat("0").format(number));
		System.out.println(new DecimalFormat("#").format(number));
		System.out.println(new DecimalFormat("0.00").format(number));	//0은 그 자리에 수가 없으면 무조건 0으로라도 출력
		System.out.println(new DecimalFormat("#.###").format(number));	//#은 그 자리에 수가 있으면 출력,없으면 출력 안함
		System.out.println("-----------------------------------");
		
		System.out.println(new DecimalFormat("000000000.0").format(number));
		System.out.println(new DecimalFormat("#########.#").format(number));
		System.out.println("-----------------------------------");
		
		//음수 부호 문자의 자리를 지정가능(실제 값이 음수가 되는 것이 아님)
		number = -1234567.89;
		System.out.println(new DecimalFormat("#.#-").format(number));
		System.out.println(new DecimalFormat("-#.#").format(number));
		//양수이면+를,음수이면-를 출력하는 방법(실제 음양의 값이 됨)
		System.out.println(new DecimalFormat("+#.#;-#.#").format(number));
		System.out.println("-----------------------------------");
		
		System.out.println(new DecimalFormat("#,###.#").format(number)); //세 자리마다 ,
		System.out.println(new DecimalFormat("#,####.#").format(number)); //네 자리마다 ,
		System.out.println(new DecimalFormat("+#,###.#;-#,###.#").format(number));
		System.out.println("-----------------------------------");
		
		System.out.println(new DecimalFormat("#.#%").format(number));//소수점 사라짐
		System.out.println(new DecimalFormat("\u00A4#.#").format(number));//통화기호
		System.out.println(new DecimalFormat("\\#,###.#").format(number));//글꼴이 한글일 때만 통화표시
		System.out.println("==============================");
		
		//parse() 메서드는 DecimalFormat의 조상인 NumberFormat에 정의되어 있는 메서드
		//Number는 래퍼클래스의 조상 (int,double,char => Integer,Double,
		//intValue(), doubleValue() 처럼 문자열을 형변환 시켜줌
		String stNum = "1.234,567.89";
		DecimalFormat df2 = new DecimalFormat("#,###.##");
		try {
			Number num = df2.parse(stNum);
			System.out.println(num); //String에서 Number객체형으로 바꾼 거라 num값은 실수가 아님
			double douNum = num.doubleValue();	//이렇게 해야 실수형으로 변환
			System.out.println(douNum*2); //실수라 연산 가능
			
			//위를 한 줄로 표현
			System.out.println((new DecimalFormat("#,###.##").parse("1,234,567.89").doubleValue())*3);
			
		}catch (ParseException e) {
			e.printStackTrace();
		}
	}
}

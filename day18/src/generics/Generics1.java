package generics;

import java.util.ArrayList;
import java.util.List;

public class Generics1 {
	public static void main(String[] args) {
		/*
		 * generics
		 * - compile-time에 타입 제한 기능(컴파일시 오류 체크)
		 * - 요소 추가시에 타입 체크 기능
		 * - 요소를 꺼낼 때 해당 타입의 값을 보장
		 * 
		 * 사용하는 곳에 따라
		 * - 클래스레벨: 변수타입이나 객체 생성시 작성하여 객체요소의 타입 제한
		 * - 메소드레벨: 파라미터/리턴타입에 타입 제한
		 * 
		 * jdk1.7 버전 이상부터는 우항의 제네릭<>은 생략 가능
		 */
		
		//(auto-)boxing: int -> Integer.valueOf(123) 자동으로 변환해줌 
		//unboxing: 객체형태로 들어온(Integer) -> int로 변환
		
		//ArrayList list = new ArrayList(); Object형
		ArrayList<String> list = new ArrayList(); //제네릭을 String으로 제한
		list.add("안녕");
		list.add("잘가");
		list.add("내일 봐");
		//list.add(123); 제네릭 선언 안 했을 때, boxing돼서 오류 안 남
		
		//제네릭 하기 전에는 String str=(String)list.get(0); 반드시 형변환(Object->String)
		String str = list.get(0);
		//int num = (int) list.get(1); 제네릭 String이라 오류
		
		List <Integer> list2 = new ArrayList();
		list2.add(1);
		list2.add(2);
		list2.add(3);
		//list2.add(3.145987); 자료형 체크하여 Integer형이 아니면 오류
		
		int num = list2.get(1);
		
		//test1(); //메인에서 호출해야 밑에 클래스 제네릭 실행됨
		test2();
	}
	//클래스 레벨 제네릭
	public static void test1() {
		Parking<String> park = new Parking();
		park.add("K7");
		park.add("GENESIS");
		
		System.out.println(park.get(0));
		System.out.println(park.get(1));
		System.out.println("--------------------");
		
		for(int i=0; i<park.size(); i++) {
			System.out.println(park.get(i));
		}
		System.out.println("--------------------");
		
		System.out.println(park.indexOf("K7"));
		System.out.println(park.indexOf("GENESIS"));
		System.out.println(park.indexOf("volvo"));
	}
	
	//메소드 레벨 제네릭
	public static void test2() {
		int num1 = run(10);
		int num2 = run(20);
		String str = run("abc");
		
		System.out.println(num1 + num2);
		System.out.println(str + num1 + num2);
		
		List<Integer> intlist = of(1,2,3,4,5,6,7);
		System.out.println(intlist);
		
		List<String> strlist = of("5교시", "집가고", "싶다", "간절");  
		System.out.println(strlist);
		
		//java에서 배열을 list로 변환해주는 메소드 Arrays.asList(array)
		//JDK9부터 List.of(array)로 새 팩토리 메소드를 사용
		//Arrays.adList, List.of: 한 번 값 넣으면 삽입, 삭제 불가 list임.
		List<String> strList2 = List.of("오늘은","월요일","끔찍","합니다");
		System.out.println(strList2); 
		// strList2.add("그래도 파이팅"); 변경 불가해서 오류!
		
	}
	//메소드 정의해주는 블럭
	public static <E> E run(E e) { 
	//<타입명>제네릭을 넣어 E객체를 반환하겠다, 매개변수로도 E타입의 e를 받겠다
		return e;
	}
	public static <T> List<T> of(T... elemen) {
		//매개변수에 ...은 0개~마음대로 넣어도 됨
		List<T> list = new ArrayList<>();
		
		for(T t : elemen) {
			list.add(t);
		}
		return list;
	}
}

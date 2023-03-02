package langPackage03.stringMethod01;

import java.util.StringTokenizer;

public class _12_StringEx12 {

	public static void main(String[] args) {
		String text = "홍길동-아무개-이순신-강감찬";
		StringTokenizer st = new StringTokenizer(text, "-");
		int count = st.countTokens();
		System.out.println("남아있는 토큰 수: " + count);
		
		/*
		for(int i=0; i<st.countTokens(); i++) {
			String name = st.nextToken();	
			//홍길동 꺼내면 남은 토큰 수 3, 아무개 꺼내면 남은 토큰 수 2 그럼 i가 2보다 작다라는 뜻이라 이름 2개밖에 안 나옴
			System.out.println(name);
		*/	
		for(int i=0; i<count; i++) {
			//count로 해야 위에 객체 생성을 해줬기 때문에 수량에 제한 안 받음
			String name = st.nextToken();	
			System.out.println(name);
		}
		System.out.println("------------------------");
		st = new StringTokenizer(text, "-");
		while(st.hasMoreTokens()) {	//토큰이 남아있는 동안엔 토큰을 하나씩 꺼내오삼
			System.out.println(st.nextToken());
		}
	} 

}

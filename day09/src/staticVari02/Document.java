package staticVari02;

public class Document {

	static int count;
	String name;
	
	/* 매개변수가 없을 때
	 * Document() { 
	 * 	name = "제목 없음" + ++count; 
	 * System.out.println("문서" + name + "이 저장되었습니다."); 
	 * }
	 */
	
	//생성자 오버로딩
	Document() {
		this("제목없음" + ++count);
	}
	Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name + "이 저장되었습니다.");
	}
}

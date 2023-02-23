package student03;

public class Student {

	static String class1;
	
	int stuNum;
	String name;
	String addr;
	String subName;
	//위까지들은 반드시 객체를 사용해야함
	static int tCount;
	
	//메서드
	String subjectName(String subName) {
		this.subName = subName;
		return this.subName;
	}
	
	static void totalCount(int tCount) {
		//this.tCount = tCount; 	this는 객체를 가리키는데 클래스 메서드는 객체가 없으므로 오류남.
		System.out.println("현재 수강인원: " + tCount);
	}
}

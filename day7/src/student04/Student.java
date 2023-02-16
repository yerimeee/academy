package student04;

public class Student {
	//속성: 이름, 학번, 학년, 학과, 강좌명 / 메소드: 들을 강좌를 인자(매개변수)로 넣어줌, 학년을 올림, 개명한 사람의 이름변경
	String name;
	int idNum;
	int grade;
	String major;
	String classname;
	
	String name(String name1) {
		name = name1;
		return name;
	}
	int idNum() {
		return idNum;
	}
	int grade() {
		++grade;
		return grade;
	}
	String major() {
		return major;
	}
	String classname(String classname1) {
		classname = classname1;
		return classname;
	}
}

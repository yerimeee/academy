package student04;

public class StudentTest {

	public static void main(String[] args) {

		//속성: 이름, 학번, 학년, 학과, 강좌명 / 메소드: 들을 강좌를 인자(매개변수)로 넣어줌, 학년을 올림, 개명한 사람의 이름변경
		Student st =  new Student();
		
		st.name = "홍길동";
		if(st.name != "홍길동") {
			String name1 = st.name;
			System.out.println("이름이" + st.name + "으로 변경되었습니다. ");
		}else
			System.out.println("이름은 " + st.name);
		
		st.idNum = 20230216;
		System.out.println("학번은 " + st.idNum);
		
		System.out.println("학년은 " + st.grade() + "학년");
		
		 st.major = "컴퓨터공학";
		System.out.println("학과는 " + st.major);
		
		System.out.println("강좌는 " + st.classname("프로그래밍 언어 활용"));
		
		//위의 자료들이 학생들이 100명이라 100개 필요하다면?
		Student[] st1 = new Student[100];
		int count = 20230101;
		for(int i=0; i<st1.length; i++) {
			st1[i] = new Student();
			st1[i].idNum = count++;
			System.out.println(st1[i].idNum);
		}
	}

}

package collection.vector01;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class Vector1 {

	public static void main(String[] args) {
		Vector vector = new Vector(); //꺽새 안 쓰면 모든 객체 자료형 받음
		ArrayList al = new ArrayList();
		
		List<Student> vlist = new Vector<>(); //부모자료형으로 형변환
		List<Student> alist = new ArrayList<>();
		//Vector와 ArrayList는 객체 자료형이기 때문에 <>표시로 해당 객체의 타입만 들어올 수 있도록 함
		
		
		vlist.add(new Student("홍길동", 480)); //add는 배열의 맨 뒤에 데이터 삽입
		vlist.add(new Student("kh정보", 30));
		vlist.add(new Student("아무개", 25));
		vlist.add(new Student("김말똥", 29));
		vlist.add(new Student("이말순", 21));
		
		alist.add(new Student("홍길동", 480));
		alist.add(new Student("kh정보", 30));
		alist.add(new Student("아무개", 25));
		alist.add(new Student("김말똥", 29));
		alist.add(new Student("이말순", 21));
		
		vlist.remove(1); //이렇게 인덱스 하나 삭제하면 인덱스 번호가 자동으로 앞으로 당겨짐
		
		for(int i=0; i<vlist.size(); i++) {
			Student student = vlist.get(i); // index에 있는 객체 얻어오기
			System.out.println(student.getName()+ "\t" + student.getStuNo());
		}
		alist.clear(); //모두 다 삭제
		if(!alist.isEmpty()) {
			for(int i=0; i<alist.size(); i++) {
				Student student = alist.get(i);
				System.out.println(student.getName()+ "\t" + student.getStuNo());
			}
		}else
			System.out.println("데이터가 없습니다.");
	}

}

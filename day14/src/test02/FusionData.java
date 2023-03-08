package test02;

public class FusionData {
	//라이브러리는 바로 배열생성 못해서 필드로 넣어주든가 메소드로 만들든가 해야됨
	void stuAdd(){	//메소드로 만듦
	Student[] fusionStudent = new Student[2]; //융합 반의 학생은 2명, 다같은 Student 타입이기 때문에 배열 만들기 가능
	fusionStudent[0] = new Student("20230001","홍길동",98,"서울특별시","010-1234-5678",true);
	fusionStudent[1] = new Student("20230001","아무개",56,"서울특별시","010-1111-2222",false);
	//만약 학생이 100명이면 학생 정보값이 다 다르기 때문에(이름,주소 등) 100번까지 다 객체 생성해줘야됨..! 어쩔 수 없음.
	
	for(int i=0; i<fusionStudent.length; i++) {
		Student stu = fusionStudent[i]; //객체를 배열에 넣어주겠다! 하면 배열의 타입과 함께 이렇게
		//System.out.println(stu); => 오버라이딩한 toString 값이 출력됨
		System.out.println(stu.getName()+"\t"+stu.getScore()+"\t"+stu.isAttending()); 
		//내가 원하는 것만 가져와 따로 출력하고 싶을 때 , "\t"는 탭만큼 띄어쓰기하는 것
	}
	
	/*
	System.out.println(fusionStudent[0].getStuNo());
	System.out.println(fusionStudent[0].getName()); //하나하나 내가 다 수동으로 가져오겠다하면 get
	
	System.out.println(fusionStudent[0].toString()); //toString설정값으로 하겠다 하면 toString
	System.out.println(fusionStudent[1]); //toString 안 써도 오버라이딩한 값 나옴
	*/
	}
}

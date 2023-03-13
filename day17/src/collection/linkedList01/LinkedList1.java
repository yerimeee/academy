package collection.linkedList01;

import java.util.LinkedList;

public class LinkedList1 {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>(); 
		//<>에는 객체만 들어갈 수 있기 때문에 기본자료형인 int라고 쓰면 안 됨
		
		//추가 add
		list.add(new Integer(99));
		list.add(Integer.valueOf(10));
		list.add(8); //Integer 지정해줬으면 이렇게 언박싱 하여 써도 됨
		list.add(20);
		list.add(3);
		
		for(int i : list) System.out.print(i + " "); 
		System.out.println();
		
		//삭제 remove
		list.remove(1); //index 1번 삭제
		for(int i : list) System.out.print(i + " "); 
		System.out.println();
		
		list.remove(); // ==list.removeFirst() 맨 앞에 있는 거 하나 삭제
		for(int i : list) System.out.print(i + " "); 
		System.out.println();
		
		list.removeLast(); //맨 끝 삭제
		
		LinkedList<Student> stuList = new LinkedList<Student>();
		stuList.add(new Student("홍길동", 23)); 
		//Student는 내가 만든 클래스라서 언박싱 기능이 없어서 new해야됨
		stuList.add(new Student("아무개", 25));
		
		for(Student i : stuList) System.out.print(i + " "); 
		System.out.println();
	}

}

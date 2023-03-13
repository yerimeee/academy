package collection.linkedList01;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LikedList2 {
	public static void main(String[] args) {
		ArrayList a = new ArrayList(1100000);
		LinkedList l = new LinkedList();
		System.out.println("순차적 추가할 때 걸린 시간");
		System.out.println("ArrayList : " + add(a));
		System.out.println("LikedList : " + add(l));
		
		System.out.println("중간에 추가할 때 걸린 시간");
		System.out.println("ArrayList : " + addM(a));
		System.out.println("LikedList : " + addM(l));
		
		System.out.println("중간 삭제할 때 걸린 시간");
		System.out.println("ArrayList : " + removeM(a));
		System.out.println("LikedList : " + removeM(l));
		
		System.out.println("끝에서부터 모두 삭제할 때 걸린 시간");
		System.out.println("ArrayList : " + removeE(a));
		System.out.println("LikedList : " + removeE(l));
	}
	
	// 각각 몇 초 걸리는지 보려고
	static long add(List list) { //둘 다 부모가 List라 둘 다 받을 수 있음
		long start = System.currentTimeMillis();
		for(int i=0; i<1000000; i++) {
			list.add(i + " ");
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	
	static long addM(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list.add(5000 , "m"); //5000번째에 m 데이터 추가
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	//중간 삭제
	static long removeM(List list) {
		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			list.remove(i); 
		//삭제 후에 데이터들이 앞으로 땡겨오고 i가 그 다음번째를 삭제하므로 중간 삭제
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
	//끝부터 삭제
	static long removeE(List list) {
		long start = System.currentTimeMillis();
		for(int i=list.size()-1; i>=0; i--) { //size면 인덱스번호 0부터 시작이니까 -1
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end-start;
	}
}

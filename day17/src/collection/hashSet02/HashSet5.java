package collection.hashSet02;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSet5 {
	public static void main(String[] args) {
		//Set으로 복권 중복없이 뽑기
		Set<Integer> set = new HashSet<Integer>();
		while(set.size() < 6) {
			set.add((int)(Math.random()*45)+1);
		}
		List list = new LinkedList(set);
		Collections.sort(list); //정렬하는 메소드
		System.out.println(list);
		
		Set<Integer> set2 = new HashSet<Integer>();
		for(int i=0; set2.size() < 6; i++) {
			set2.add((int)(Math.random()*45)+1);
		}
		List list2 = new LinkedList(set2);
		Collections.sort(list2); 
		System.out.println(list2);
	}
}

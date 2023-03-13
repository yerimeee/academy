package collection.treeSet03;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSet3 {
	public static void main(String[] args) {
		Object[] arr = {1,2,3,4,5,6,7,8,9,1,2,3,4};
		Set set = new TreeSet();
		for(Object i : arr)
			set.add(i);
		
		System.out.println(set); //오름차순 정렬
		
		//내림차순 정렬
		NavigableSet<Integer> desending = ((TreeSet<Integer>)set).descendingSet();
		/*
		for(Integer i : desending) {
			System.out.println(i + " ");
		}
		*/
		System.out.println(desending);
	} 
}

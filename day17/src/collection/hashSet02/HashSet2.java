package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSet2 {

	public static void main(String[] args) {
		Set<String> set = new HashSet<>(); //Set형이든 Hashset형이든 상관없음
		set.add("java");
		set.add("HTML");
		set.add("JSP");
		set.add("java");
		set.add("ORACLE");
		
		System.out.println("size: " + set.size());
		//"java"는 같은 거라 한 번만 들어가서 4개가 나옴
		
		//new해서 한 건 remove 못하지만 여긴 가능
		set.remove("HTML");
		set.remove("ORACLE");
		iteratorPrint(set.iterator());
		System.out.println();
	}
	static void iteratorPrint(Iterator<String> i) {
		while(i.hasNext()) {
			System.out.print(i.next() + " ");
			/*next()를 넣지 않으면 다음 것을 보지 않기 때문에 
			while(i.hasNext())값의 객체 수가 줄어들지 않아 무한반복됨
			*/
		}
		System.out.println();
	}
}

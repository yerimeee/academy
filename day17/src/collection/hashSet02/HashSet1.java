package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class A {
	String aa;
	public A(String aa) {
		this.aa = aa;
	}
}

public class HashSet1 {
	public static void main(String[] args) {
		HashSet set1 = new HashSet(); //내걸로 사용가능
		Set set2 = new HashSet(); //부모타입으로 형변환 후도 사용가능
		
		A a1 = new A("c");
		
		set1.add(new A("a"));
		set1.add(new A("b"));
		set1.add(a1); //객체 생성 후 이렇게 써도 됨
		set1.add(new A("d"));
		set1.add(new A("e"));
		
		System.out.println("size: " + set1.size());
		
		Iterator<A> iterator = set1.iterator(); 
		//위의 객체 5개를 변수 iterator에 넣어줌
		//hasNext(): 남아있는 객체가 있는지 논리
		//next(): 순회하면서 값 얻어오기
		
		System.out.print("set1 출력: ");
		while(iterator.hasNext()) { //하나 꺼내오면 개수 차감되고 다 꺼내서 false됨
			A a2 = iterator.next(); 
			//A타입으로 a2에 저장. iterator.next(); 저장 안 하려면 이렇게 해도 됨
			System.out.print(a2.aa + " ");
		}
		System.out.println();
		
		set1.remove(a1);
		System.out.print("set1 삭제 후 출력: ");
		iterator = set1.iterator(); //위에서 다 꺼내서 없기 때문에 다시 넣어줘야 함
		iteratorPrint(set1.iterator()); //메소드 호출
		System.out.println();
		
		set1.add(new A("e")); 
		//새로운 주소를 가진 객체 e 한 번 더 넣어서 e가 중복으로 출력
		System.out.println("size: " + set1.size());
		System.out.print("set1에 e 입력 후 출력: ");
		iterator = set1.iterator(); 
		iteratorPrint(set1.iterator());
		System.out.println();
		
		set1.add(a1);
		System.out.println("size: " + set1.size());
		set1.add(a1); 
		//a1은 위에서 new로 객체를 생성했고 그 객체를 넣은 것이기 때문에 같은 것이 출력
		System.out.println("size: " + set1.size());
		System.out.print("set1에 a1 두번 입력 후 출력: ");
		iterator = set1.iterator(); 
		iteratorPrint(set1.iterator()); 
		System.out.println();
		
	}
	//while을 계속 쓰게돼서 복붙할바에 메소드로 만들어 걍 호출해줄라고
	static void iteratorPrint(Iterator<A> i) {
		while(i.hasNext()) {
			A a2 = i.next(); 
			System.out.print(a2.aa + " ");
		}
		System.out.println();
	}
}

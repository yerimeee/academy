package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Person {
	String name;
	int age;
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}
public class HashSet3 {

	public static void main(String[] args) {
		Set<Person> set = new HashSet<Person>();
		
		set.add(new Person("홍길동", 20));
		set.add(new Person("아무개", 30));
		
		System.out.println("size: " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();
	}
	
	static void iteratorPrint(Iterator<Person> i) {
		while(i.hasNext()) {
			//System.out.print(i.next() + " "); 
			//패키지명.클래스명@주소(toString오버라이딩 안 했을때)
			Person p = i.next(); 
			//변수에 저장 안 하고 출력문에 i.next 쓰면 다음 객체라 아무개 이름과 홍길동의 나이가 출력됨 
			System.out.print(p.name + ", "); //private 인스턴스 변수라 가능
			System.out.print(p.age + "\t");
			
		}	
		System.out.println();
	}

}

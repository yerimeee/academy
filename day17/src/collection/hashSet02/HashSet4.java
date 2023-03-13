package collection.hashSet02;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

class Member {
	public String name; //equals 오버라이딩에서 name을 가져오려면 public
	public int age;
	public Member(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	//equals는 원래 주소가 같은가 보는 거라서 값을 보기위해 오버라이딩함
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			return member.name.equals(name) && member.age == age;
		}
		return false; //if값이 참이 아니면 false
	}
	//주소를 같게 만들어주는 오버라이딩
	@Override
	public int hashCode() {
		return name.hashCode() + age; 
		//이름과 나이가 같으면 해시코드를 같게 하라
	}
	@Override
	public String toString() {
		return "Member [name=" + name + ", age=" + age + "]";
	}
}
public class HashSet4 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		//값이 같으니 size 개수가 1개로 나오도록 하기(주소는 다른 객체들임)
		set.add(new Member("홍길동", 20));
		set.add(new Member("홍길동", 20));
		
		System.out.println("size: " + set.size());
		iteratorPrint(set.iterator());
		System.out.println();
	}
	
	static void iteratorPrint(Iterator<Member> i) {
		while(i.hasNext()) {
			Member p = i.next(); 
			System.out.print(p.name + ", "); 
			System.out.print(p.age + "\t");
		}	
		System.out.println();
	}
}

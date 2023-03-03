package test02;
class Person {
	private String name;
	private int age;
	
	Person(){ }
	Person(String name, int age) {
		this.name = name;
		this.age = age;	//매개변수를 인스턴스 변수에 넣는 작업
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getage() {
		return age;
	}
	@Override
	public String toString() {
		return "이름 : " + name + ", 나이 : " +age;
	}
}

public class PersonTest {
	public static void main(String[] args) {
		Person p1 = new Person();
		Person p2 = new Person("홍길동",25);
		
		//System.out.println(p2.name); private으로 만들어놔서 다른 클래스에서 접근 불가 그래서 get씀
		System.out.println(p2.getName());	//api에서 get메서드 만들어주고 메인에서 get으로 출력
		//p1.name = "아무개" private으로 만들어놔서 다른 클래스에서 수정 불가 그래서 set씀
		p1.setName("아무개"); //api에서 set메서드 만들어주고 메인에서 set으로 호출
		System.out.println("이름: " + p2.getName() + ", 나이: " + p2.getage());
		//이렇게 원하는 형식을 출력하고 싶어서 출력문을 쓰다보면 사람이 100명이면 100개를 다 써야함 그래서 toString오버라이딩 필요
		System.out.println(p1);
		System.out.println(p2); //변수값만 출력해도 원하는 형식의 값이 출력!
	}
}

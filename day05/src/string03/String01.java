package string03;

public class String01 {

	public static void main(String[] args) {
		//참조 자료형에서 ==,!=는 객체가 생성된 주소가 같은지 아닌지를 비교
		String name = "홍길동";
		String name2 = "홍길동"; //이름이 똑같기 때문에 heap 메모리에 홍길동 객체 하나만 생성되고 name과 name2의 주소가 같음
		
		System.out.println("주소가 같은가?" + (name == name2));
		
		String name3 = new String ("KH정보교육원"); //String은 클래스 이름 ()는 매개변수
		String name4 = new String ("KH정보교육원"); // new를 썼기 때문에 똑같은 내용의 다른 주소 메모리가 생성됨
		
		System.out.println("주소가 같은가?" + (name3 == name4));
		String name5 = "아무개"; // new를 안 써도 내용이 다르기 때문에 아무개 내용의 메모리가 새로 생성됨.
		String name6 = "홍길동"; // name == name2 == name6 
		System.out.println("주소가 같은가?" + (name == name6));
		name = "이순신"; //name에 새로운 내용 덮어쓰기 불가. 이순신 내용의 다른 주소가 객체가 따로 생성됨
						// name2와 name6만 같은 메모리를 가리키고 name은 새로 바뀐 이순신을 가리킴.
		System.out.println("주소가 같은가?" + (name == name6));
		name2 = "강감찬";
		name6 = "김예림"; //이렇게 배정해서 홍길동을 가리키는 객체가 아무것도 없어지면 자바가 자동으로 홍길동 메모리를 삭제함.
		
		System.out.println (name3.equals(name4)); // .equals : name3과 name4안에 들어가있는 값이 같은지 비교해주는 메서드
		
		boolean bool = name.equals("이순신"); //name의 내용이 이순신과 같은가?
	}

}

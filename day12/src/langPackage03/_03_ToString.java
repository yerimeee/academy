package langPackage03;

public class _03_ToString {

	public static void main(String[] args) {
		Value v1 = new Value(5);
		Value v2 = new Value(5);
		System.out.println(v1);	//객체를 그냥 호출하면 langPackage03.Value@6f2b958e 이렇게 나옴
		System.out.println(v1.toString()); 
		//toSting() 메서드 써도 langPackage03.Value@4e718207 이렇게 나와서 굳이 메서드 안 써도 됨
		
		Card card1 = new Card();
		Card card2 = new Card("HEART", 10);
		System.out.println(card1);
		System.out.println(card2);
	}

}

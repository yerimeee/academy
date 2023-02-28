package langPackage03;

import java.util.Arrays;

public class _04_Clone {

	public static void main(String[] args) {
		Card card1 = new Card("CLOVER", 3);
		Card card2 = (Card)card1.clone();	//card1.clone()이 object 타입이기 때문에 강제변환
		
		System.out.println(card1);
		System.out.println(card2);
		
		//배열을 이용해 복제
		int[] arr = {1,2,3,4,5};
		
		int[] arrClone = arr.clone(); //object 타입이기 때문에 그냥 이렇게 씀
		arrClone[0] =6;
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(arrClone));
		
		//객체 생성시 뒤에 getClass()를 호출하면 클래스 이름을 호출
		Card card3 = new Card("DIA", 8);
		Class cObj = new Card().getClass();	
		System.out.println(cObj);
		//해시코드 빼고 이름만 나옴 =>class langPackage03.Card
		System.out.println(cObj.getName());	//이것도 가능 =>langPackage03.Card
		System.out.println(cObj.toString());
	}

}

package product02;

public class Buyer {
	int money = 500;
	int bonusPoint = 0; //내 포인트 잔여
	
	void buy(Product p) { 
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입하였습니다.");
	}
	
	/*void buy(Product p = new Product()) { //부모 Product는 자식의 객체가 생성된 것의 주소가 들어오면 됨. 만약 이 작업을
	 * 안 한다면? 각각의 물품에 따라 객체 생성을 일일히 다 만들어줘야됨
		
	}
	*/
}

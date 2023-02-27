package product03;

public class Buyer {
	int money = 500;
	int bonusPoint = 0; 
	Product[] cart = new Product[10];	//Product[]는 객체형으로 배열 만드는 거~~~
	int i;	//인스턴스 변수라 기본값 0으로 초기화됨
	
	void buy(Product p) { //각 객체 생성한 주소들이 다 들어올 수 있음
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		cart[i++] = p;	//++i 이건 안 됨. 그러면 인덱스번호 1번부터 들어감
		System.out.println(p + "를 구입하였습니다.");
	}
	void summary() {
		int sum = 0; //지역변수라 초기화
		String itemList = "";
		for(Product i : cart) {	//객체 타입은 초기값이 null
			if(i == null)	//잔액이 부족하여 더 이상 물품이 없을 때
				break;
			sum += i.price;
			itemList += i + ", ";
		}
		/*for(int i=0; i<cart.length; i++){ 
		 * if(cart[i] == null)
		 * 	break;
		/ sum += cart[i].price;
		 * itemList += cart[i] + ", ";
		 * }
		 */
		System.out.println("총 구입금액: " + sum);
		System.out.println("구입 물품들: " + itemList);
	}
}

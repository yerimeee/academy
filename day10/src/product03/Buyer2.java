package product03;

import java.util.ArrayList;

public class Buyer2 {
	int money = 500;
	int bonusPoint; 
	ArrayList<Object> item = new  ArrayList<Object>();	

	void buy(Product p) { 
		if(money < p.price) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		item.add(p);	//ArrayList에 삽입은 add로
		System.out.println(p + "를 구입하였습니다.");
	}
	
	void refund(Product p) {
		if(item.remove(p)) {	//안 샀는데 반품해달라고 할 수 있으니 if문
			money += p.price;
			bonusPoint -= p.bonusPoint;
			System.out.println(p + "를 반품하였습니다.");
		}
		else
			System.out.println("구입한 물품이 아닙니다.");
	}
	void summary() {
		int sum = 0; 
		String itemList = "";
		if(item.isEmpty()) {
			System.out.println("구입한 물품이 없습니다.");
			return;
		}
		
		for(int i=0; i<item.size(); i++) {	
			Product p = (Product)item.get(i);
			//물품들을 부모타입으로 형변환, ArrayList의 index번호의 객체를 얻어올 때 get(index)메서드
			sum += p.price;
			itemList += p + ", ";
		}
		System.out.println("총 구입금액: " + sum);
		System.out.println("구입 물품들: " + itemList);
	}
}

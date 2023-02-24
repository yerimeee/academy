package product03;

public class Product {
	 int price; //사는 물품의 가격
	 int bonusPoint; //사는 물품의 10%를 포인트로 줌
	
	Product(int price) {
		this.price = price;
		bonusPoint = price/10;
	}
}

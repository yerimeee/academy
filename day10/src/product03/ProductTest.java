package product03;

public class ProductTest {

	public static void main(String[] args) {
		Buyer b = new Buyer();
		
		b.buy(new Computer());
		b.buy(new Tv1());
		b.buy(new Audio());
		b.buy(new Game());
		b.buy(new Computer());

		System.out.println("현재 남은 돈: " + b.money);
		System.out.println("보너스 점수: " + b.bonusPoint);
		b.summary();
		
	}

}

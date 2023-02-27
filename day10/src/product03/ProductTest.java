package product03;

public class ProductTest {

	public static void main(String[] args) {
		Buyer2 b = new Buyer2();
		Computer com = new Computer();
		Tv1 tv = new Tv1();
		Audio audio = new Audio();
		Game game = new Game();
		
		b.buy(com);
		b.buy(tv);
		b.buy(audio);
		b.summary();
		System.out.println();
		
		b.refund(audio);
		b.summary();
		System.out.println();
		
		b.buy(game);
		b.buy(com);
		b.buy(game);

		System.out.println("현재 남은 돈: " + b.money);
		System.out.println("보너스 점수: " + b.bonusPoint);
		b.summary();
		
	}

}

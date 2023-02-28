package userException02;

public class Account {
	private int balance;
	
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void deposit(int money) {
		balance += money;
		System.out.println("입금액 " + money +"원이 입금됨");
	}
	public void withdraw(int money) throws NotSufficientException {	//여기서 오류가 날 거 같으니 처리해라
		if(balance < money) {
			throw new NotSufficientException("잔고 " + (money-balance) + "원 부족"); //고의 오류 호출
		}
		balance -= money;
		
	}
	/*
	public void withdraw(int money) {
		if(balance < money) {
			System.out.println("잔고 " + (money-balance) + "원 부족");
			return; //break는 반복문을 빠져나올 때 사용하는 거니까.
		}
		balance -= money;
		
	}
	*/
}

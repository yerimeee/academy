package userException02;

public class AccountTest {

	public static void main(String[] args) {
		Account account = new Account();
		account.deposit(100000);
		System.out.println("잔액: " + account.getBalance());
		
		try {
			account.withdraw(150000);
		} catch (NotSufficientException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("잔액: " + account.getBalance());
	}

}

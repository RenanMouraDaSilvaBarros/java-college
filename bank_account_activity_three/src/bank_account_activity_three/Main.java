package bank_account_activity_three;

public class Main {
	public static void main(String[] args) {
		BankManager bankManager = new  BankManager();
		
		while(bankManager.isActive) {
			bankManager.initial();
		}
		
		
	}

}

package bank_account_activity_three;

public class Bank{

	String name;
	double balance = 0.0;
	boolean accountIsSpecial;

	Bank(String name, boolean accountIsSpecial) {
		this.name = name;
		this.accountIsSpecial = accountIsSpecial;
	}
	
	Bank(){
		
	}

	void deposit(double value) {
		if (value > 0)
			this.balance = value;
		else
			System.out.println("invalid operation!");
	}

	void withdraw(double value) {
		if (!accountIsSpecial)
			if (value <= balance)
				this.balance -= value;
			else
				System.out.println("invalid operation!");
		else
			this.balance -= value;
	}
	
	@Override
	public String toString() {
		return "Bank [O nome do correntista é: " + name + ", O saldo é: " + balance + ", A conta é especial: " + accountIsSpecial + "]\n";
	}
	
	

}

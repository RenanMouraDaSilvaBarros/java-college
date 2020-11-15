package bank_account_activity_three;

public class Configuration{
	
	void throwException(){
		System.out.println("throw exception invalid operation error\n".toUpperCase());
	}
	
	void clearScreen() {
		 System.out.print("\r\n");
	}
	
	boolean validate(char input) {
		if(input == 's')
			return true;
		else if(input == 'n')
			return false;
		this.throwException();
		return false;	
	}
	

}

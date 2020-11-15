package bank_account_activity_three;

public class Menu {
	
	boolean isActive = true;
	
	Menu(){}
	
	void initial() {
			System.out.print("Bem vindo! ao banco\n");
			System.out.print("1-Cadastre-se\n");
			System.out.print("2-Serviços da conta\n");
			System.out.print("3-Listar todos os clientes\n");
			System.out.print("4-Finalizar expediente\n");	
	}
	
	void services() {
		System.out.print("1-Realizar depósito\n");
		System.out.print("2-Realizar saque\n");
		System.out.print("3-Extrato\n");
		System.out.print("4-voltar\n");
	}
	
	
	
}

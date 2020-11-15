package bank_account_activity_three;

import java.util.ArrayList;

import java.util.Scanner;

public class BankManager {

	ArrayList<Bank> myClients = new ArrayList();	
	
	boolean isActive = true;

	void register() {
		System.out.print("----------------------------------------------------\n");
		
	    Scanner input = new Scanner(System.in);

		System.out.println("digite seu nome: ");
		String name = input.nextLine();

		System.out.println("Deseja crédito especial(insira s ou n): ");
		boolean isSpecial = new Configuration().validate(input.next().charAt(0));

		myClients.add(new Bank(name, isSpecial));

		System.out.println("----------------------------------------------------\n\n");

	}

	void show(int index) {
		System.out.print(myClients.get(index).toString());
	}
	
	void showAll() {
		if (!myClients.isEmpty()) {
			for (Bank element : myClients) {
				System.out.print("----------------------------------------------------\n");
				System.out.print(element.toString());
				System.out.println("----------------------------------------------------\n\n");

			}
		} else {
			new Configuration().throwException();
		}

	}
	
	void effertuarDeposit(int index) {
		Scanner input = new Scanner(System.in);
		System.out.println("Valor: ");
		myClients.get(index).deposit(input.nextDouble());
	}
	
	void withdraw(int index) {
		Scanner input = new Scanner(System.in);
		System.out.println("Valor: ");
		myClients.get(index).withdraw(input.nextDouble());
	}
	
	void initial() {
		Scanner input = new Scanner(System.in);
		new Menu().initial();
		directInitial(input.nextInt());	
	}
	
	void operations() {
		System.out.println("----------------------------------------------------");
		if (!myClients.isEmpty()) {
			Scanner input = new Scanner(System.in);
			System.out.println("Busque pelo nome do cliente: ");
			String search = input.nextLine();
			
			for (int i = 0; i < myClients.size(); i++) {
				if (myClients.get(i).name.toLowerCase().equals(search.toLowerCase())) {
					new Menu().services();
					directServices(input.nextInt(), i);
				}
			}
		}
		else {
			new Configuration().throwException();
		}
		System.out.println("----------------------------------------------------\n\n");
	}
	
    void directInitial(int option) {
    	switch(option) {
		case 1:
			register();
			break;
		case 2:
			operations();
			break;
		case 3:
			showAll();
			break;
		case 4:
			isActive =false;
			System.out.println("good bye!");
			break;
		}
	}
    
    void directServices(int option, int index) {
		switch(option) {
		case 1:
			effertuarDeposit(index);
			break;
		case 2:
			withdraw(index);
			break;
		case 3:
			show(index);
			break;
		case 4:
			initial();
			break;
		}
		
	}
	
}

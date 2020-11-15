package restaurant_activity_two;

public class Menu {

	SolicitationManager solicitation = new SolicitationManager();

	boolean isActive = true;

	void initial() {
			System.out.print("Bem vindo! ao Restaurante Caseiro\n");
			System.out.print("1-Realizar pedido\n");
			System.out.print("2-Listas todos os pedidos\n");
			System.out.print("3-Finalizar expediente\n");
	}
	
	void direction(int option) {
		
		switch (option) {
		case 1:
			solicitation.makeSolicitation();
			break;
		case 2:
			solicitation.allShowSolicitation();
			break;
		case 3:
			isActive = false;
			System.out.println("Good bye!\n\n");
			break;
		}
		
	}

	

}

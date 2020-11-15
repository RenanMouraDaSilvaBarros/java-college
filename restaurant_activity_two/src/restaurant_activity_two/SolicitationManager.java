package restaurant_activity_two;

import java.util.ArrayList;
import java.util.Scanner;

public class SolicitationManager {

	ArrayList<Solicitation> solicitation = new ArrayList();

	boolean isEmpty(double Value) {
		return (Value == 0) ? true : false;
	}
	
	void makeSolicitation(){
		System.out.print("----------------------------------------------------\n");
		Scanner input = new Scanner(System.in);
		Solicitation newSolicitation = new Solicitation();
		
		System.out.println("Zere os campos caso não exista pedido!");
		
		System.out.println("Insira o nome do cliente: ");
		newSolicitation.name = input.nextLine();
		
		System.out.println("Insira o peso da refeicao: ");
		newSolicitation.food.meal = input.nextDouble();
		
		System.out.println("Insira o peso da sobremesa: ");
		newSolicitation.food.dessert = input.nextDouble();
		
		System.out.println("Insira a quantidade de refrigerat 2L: ");
		newSolicitation.drinks.twoLiterSoda = input.nextInt();
		
		System.out.println("Insira a quantidade  de refrigerat 600mL : ");
		newSolicitation.drinks.sixHundredMlSoda = input.nextDouble();

		System.out.println("Insira a quantidade de refrigerat em lata: ");
		newSolicitation.drinks.cannedSoda = input.nextDouble();

		System.out.println("Insira a quantidade de cerveja: ");
		newSolicitation.drinks.beer = input.nextDouble();
		
		solicitation.add(newSolicitation);
		System.out.println("----------------------------------------------------\n\n");
	}

	void allShowSolicitation() {

	if(!solicitation.isEmpty()) {
		for (Solicitation element : solicitation) {
			System.out.print("----------------------------------------------------\n");

			System.out.printf("Pedido do nosso amado cliente %s\n", element.name);

			if (!isEmpty(element.food.meal)) 
				System.out.printf("refeicao %.2f kg\n", element.food.meal);
			
			if (!isEmpty(element.food.dessert)) 
				System.out.printf("sobremesa %.2f kg\n", element.food.dessert);

			if (!isEmpty(element.drinks.twoLiterSoda)) 
				System.out.printf("%.0f refrigerat 2L\n", element.drinks.twoLiterSoda);

			if (!isEmpty(element.drinks.sixHundredMlSoda)) 
				System.out.printf("%.0f refrigerate 600mL\n", element.drinks.sixHundredMlSoda);

			if (!isEmpty(element.drinks.cannedSoda)) 
				System.out.printf("%.0f refrigerate em lata\n",element.drinks.cannedSoda);

			if (!isEmpty(element.drinks.beer)) 
				System.out.printf("%.0f cerveja\n",element.drinks.beer);
			System.out.println("----------------------------------------------------\n\n");

		}

	}else {
		System.out.println("Vázio!\n\n");	
	}
	
		
	}

}

package restaurant_activity_two;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Menu menu = new Menu();
		 Scanner input = new Scanner(System.in);
		 
		 while(menu.isActive){
			 menu.initial();
			 menu.direction(input.nextInt());
		 }
	}

}

package book_activity_five_and_six;

import java.util.ArrayList;
import java.util.Scanner;

public class BookManager {

	Layout layout = new Layout();
	ArrayList<Book> BookManager = new ArrayList();
	boolean isActive  = true;

	void register() {

		Scanner input = new Scanner(System.in);
		String authotController, descriptionController,yearController;
		

		layout.start();

		layout.author();
		authotController = input.nextLine();
		layout.year();
		yearController = input.nextLine();
		layout.description();
		descriptionController = input.nextLine();

		BookManager.add(new Book(authotController, yearController, descriptionController)

		);

		layout.end();
	}

	void showAll() {
		if (!BookManager.isEmpty()) {
			for (Book element : BookManager) {
				System.out.print("----------------------------------------------------\n");
				System.out.print(element.toString());
				System.out.println("----------------------------------------------------\n\n");

			}
		} else {
			
		}

	}
	
    void direct(int option) {
    	
    	switch(option) {
		case 1:
			register();
			break;
		case 2:
			showAll();
			break;
		case 3:
			isActive =false;
			System.out.println("good bye!");
			break;
		}
	}
	
	void initState() {
		Scanner input = new Scanner(System.in);
		layout.initial();
		direct(input.nextInt());
		
	}
}

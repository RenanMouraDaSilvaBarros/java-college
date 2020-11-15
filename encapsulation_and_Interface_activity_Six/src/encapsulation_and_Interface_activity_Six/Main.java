package encapsulation_and_Interface_activity_Six;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner textController = new Scanner(System.in);
		
		User user = new User();
		
			System.out.println("insira seu nome");
			user.setName(textController.nextLine());
			System.out.println("inseira seu email");
			user.setLogin(textController.nextLine());
			while(user.getPassworld() == null) {
				System.out.println("criar uma senha");
				user.setPassworld(textController.nextLine()); 
				
			}
			
			System.out.println("sucesso!");

		System.out.println(user);
		
		textController.close();
		
	}

}

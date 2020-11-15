import java.util.Scanner;

class Five{
	public static void main(String[] args){
		long factorialIs = 1;
		int issueRestriction = 20;

		while(issueRestriction <=40){
			for(int i = 1; i <= issueRestriction; i++)
				System.out.printf("factorial of %d is %d\n", i, factorialIs *= i);
		
		System.out.printf("------------------------\n");
		issueRestriction+=10;
		System.out.println("press any key....");
		new Scanner(System.in).next().charAt(0);
		
		}

	}
}

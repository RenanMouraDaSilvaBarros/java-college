package academic_record_activity_four;

import java.util.Scanner;

public class MyDate {

	int day;
	int month;
	int year;


	void add() {
		Scanner input = new Scanner(System.in);
		System.out.println("Data de nascimento");
		System.out.println("Dia: ");
		day = input.nextInt();
		System.out.println("Mês: ");
		month = input.nextInt();
		System.out.println("Ano: ");
		year = input.nextInt();
		
	}

	@Override
	public String toString() {
		return "Data: " + day + "/" + month + "/" + year;
	}
}

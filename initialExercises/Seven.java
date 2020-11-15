import java.util.Scanner;

class Seven{
	public  static void main(String[] args){
		int number = new Scanner(System.in).nextInt();

		while(number != 1){
			number = (number % 2 == 0)? number/2: number * 3 + 1;
			String formact = (number>1)?"->":"\n";
			System.out.print(number + formact);
		}
	}
}

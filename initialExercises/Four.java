
class Four{
	public static void main(String[] args){
		int factorialIs = 1;
		for(int i = 1; i < 11; i++)
			System.out.printf("factorial of %d is %d\n", i, factorialIs*=i);
	}
}

class Six{
	public static void main(String[] args){
		int beforePrevious = 0 , previous = 1;
		int fibonacci = 0;

		System.out.printf("%d\n%d\n", beforePrevious, previous);

		while(fibonacci <= 100){
			fibonacci = beforePrevious + previous;
			System.out.println(fibonacci);
			beforePrevious = previous;
			previous = fibonacci;
		}
	}
}

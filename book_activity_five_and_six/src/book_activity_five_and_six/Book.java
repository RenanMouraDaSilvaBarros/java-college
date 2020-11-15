package book_activity_five_and_six;

public class Book {

	
	String author;
	String year;
	String description;

	Book(String author, String year, String description) {
		this.author = author;
		this.year = year;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Aoutor=" + author + "\nAno=" + year + "\ndescrição =" + description + "\n";
	}


}

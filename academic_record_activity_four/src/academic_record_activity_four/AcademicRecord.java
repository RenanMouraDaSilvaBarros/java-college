package academic_record_activity_four;

public class AcademicRecord {

	String name;
	String registrationNumber;
	MyDate dateOfBirth;
	int YearOfRegistration;
	boolean hasBag;
	
	

	void initializeRegistration(String name, String registrationNumber,MyDate dateOfBirth, int YearOfRegistration,
			boolean hasBag) {
		this.name = name;
		this.registrationNumber = registrationNumber;
		this.dateOfBirth = dateOfBirth;
		this.YearOfRegistration = YearOfRegistration;
		this.hasBag = hasBag;
	}
	
	double calculateMonthlyFees(){
		double mensalities = 400;
		if(hasBag) 
			return mensalities/200; 
		return mensalities;	
	}
	
	@Override
	public String toString() {
		String bag = (hasBag)?"\nO aluno bolsista.":"";
		return "Nome do aluno:" + name + "\nNúmero de Matrícula: " + registrationNumber + "\nData de Nascimento: "
				+ dateOfBirth + bag +"\nAno de Matrícula: " + YearOfRegistration +"\n";
	}
}

package academic_record_activity_four;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import java.util.Calendar;

public class AcademicManager{
	
	ArrayList<AcademicRecord> academic = new ArrayList();
	
	boolean isActive = true;
	
	private Layout layout = new Layout();
	
	void toRegister(){
		
		Scanner input = new Scanner(System.in);
		String nameController;
		String  registrationNumberController= randomGenarete();
		MyDate dateOfBirthController = new MyDate();
		boolean hasBagController;
		int year =  Calendar.getInstance().get(Calendar.YEAR);
		
		layout.start();
		
		layout.name();
		nameController = input.nextLine();
		
		System.out.print("Seu número de matricula: "+registrationNumberController+"\n");
		
		dateOfBirthController.add();
		
		layout.hasBag();
		hasBagController = HasBag(input.next().charAt(0));
		
		AcademicRecord academicRecord = new AcademicRecord();
		
		academicRecord.initializeRegistration(nameController, registrationNumberController , dateOfBirthController, year, hasBagController);
		
		academic.add(academicRecord);
		
		layout.end();
		
	}
	
	void showAll(){
		if (!academic.isEmpty()) {
			for (AcademicRecord element : academic) {
				layout.start();
				System.out.print(element.toString());
				layout.end();
			}
		} else {
			System.out.println("Vázio!");
		}
	}
	
	void toShow(int index){
		System.out.println(academic.get(index).toString());
	}
	
	void lookForAluno(){
		
		Scanner input = new Scanner(System.in);
		
		if(!academic.isEmpty()) {
			
			layout.name();
			
			 String search = input.nextLine().toLowerCase();	
		
			for (int i = 0; i < academic.size(); i++) {
				
				if(search.equals(academic.get(i).name.toLowerCase())){
					toShow(i);
					
				}
				
				
			}
			
		}	
	}
	
	String randomGenarete(){
		
		Calendar c = Calendar.getInstance();
		int number;
		 Random genarete = new Random();
			 number = genarete.nextInt();//1 000 000 000
		String random = Integer.toString(c.get(Calendar.YEAR))+ Integer.toString(number);
		return random;
		
	}
	
	boolean HasBag(char option) {
	    	switch(option) {
			case 's':
				return true;	
	    	}
	    	
	    	return false;
	    }
	
	void direct(int option) {
			switch(option) {
			case 1:
				toRegister();
				break;
			case 2:
				lookForAluno();
				break;
			case 3:
				showAll();
				break;
			case 4:
				isActive = false;
				System.out.println("see you, good bye!\n");
				break;
			}
			
		}
	  
	void initState() {
			Scanner input = new Scanner(System.in);
			layout.initial();
			direct(input.nextInt());
			
	}
		
	

}

package academic_record_activity_four;

public class Layout{
	
	void start(){
		System.out.print("----------------------------------------------------\n");
	}
	
    void end(){
		System.out.println("----------------------------------------------------\n\n");
	}
    
    void name(){
		System.out.print("Insira seu nome\n");
	}
   
    void dateOfBirth(){
		System.out.print("Insira a data de nascimento\n*Exemplo(01/01/01)*\n");
	}
    
    void hasBag(){
		System.out.print("Aluno bolsita:\n");
		System.out.print("s-sim	n-nao\n");
	}
    
    void initial(){
    	System.out.println("1 - Cadastar");
    	System.out.println("2 - Filtrar por aluno");
    	System.out.println("3 - Listar todos");
    	System.out.println("4 - sair");
    }
   
}

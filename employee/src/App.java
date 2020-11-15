import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int chosse = 1;
        Scanner input = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        while (chosse != 0) {
            System.out.println("1 - inserir funcionario; 2 - mostrar lista de funcionários; 0 - sair");
            System.out.print("op: ");
            chosse = input.nextInt();
            if (chosse == 1) {
                System.out.println("1 - Funcionario Assalariado; 2 - Funcionario Comissionado");
                int chosse2 = input.nextInt();
                if (chosse2 == 1) {
                    System.out.print("Nome: ");
                    String name = input.next();

                    System.out.print("registration: ");
                    String registration = input.next();

                    System.out.print("Salario semanal: ");
                    double salarioSemanal = input.nextDouble();

                    SalariedEmployee novo = new SalariedEmployee(name, registration, salarioSemanal);
                    employees.add(novo);
                }
                if (chosse2 == 2) {
                    System.out.print("Nome: ");
                    String nome = input.next();

                    System.out.print("Matricula: ");
                    String registration = input.next();

                    System.out.print("Quantidade de vendas: ");
                    int quantityForSale = input.nextInt();

                    System.out.print("Valor por venda: ");
                    double valuePerSale = input.nextDouble();

                    CommissionedEmployee novo = new CommissionedEmployee(nome, registration, quantityForSale,
                            valuePerSale);
                    employees.add(novo);
                }
            }
            if (chosse == 2) {
                for (int i = 0; i < employees.size(); i++) {
                    System.out.println(employees.get(i));
                }
            }
        }

        input.close();
    }
}

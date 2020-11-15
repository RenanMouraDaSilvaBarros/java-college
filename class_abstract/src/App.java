
import java.util.Scanner;
import managment.EmployeeManagment;

public class App {
    public static void main(String[] args) {

        EmployeeManagment employeeManagment = new EmployeeManagment();
        Scanner input = new Scanner(System.in);
        boolean isAtivicty = true;
        int choose;

        while (isAtivicty) {

            System.out.println("1-add employees");

            if (!EmployeeManagment.employees.isEmpty())
                System.out.println("2-add DepartmentBoss");

            System.out.println("3-show all loans");
            System.out.println("0-exit");

            choose = input.nextInt();

            switch (choose) {
                case 1:
                    employeeManagment.addEmployee();
                    break;
                case 2:
                    employeeManagment.addDepartmentBoss();
                    break;
                case 3:
                    employeeManagment.showLoanAll();
                    break;
                case 0:
                    isAtivicty = false;
            }
        }
        input.close();

    }
}
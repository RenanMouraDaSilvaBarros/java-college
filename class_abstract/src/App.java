import entities.BankLoan;
import entities.DepartmentBoss;
import entities.Employee;
import enums.Department;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Employee> employees = new ArrayList<Employee>();

        employees.add(new Employee("Isaias man", 24, "01/01/2001", -50, "10/01/1336"));
        employees.add(new Employee("Renan moura", 18, "01/01/2001", 100, "10/01/1336"));
        employees.add(new Employee("Eduardo", 24, "01/01/2001", 5, "10/01/1336"));
        employees.add(new Employee("Amado batista", 100, "01/01/2001", 1000, "10/01/1336"));

        Employee employee = new Employee("Renan moura", 18, "01/01/2001", 1000, "10/01/1336");
        employees.add(new DepartmentBoss(employee, Department.CLEANING, "02/2020"));

        for (Employee e : employees) {
            System.out.println(BankLoan.calculateLoan(e));
        }

    }
}

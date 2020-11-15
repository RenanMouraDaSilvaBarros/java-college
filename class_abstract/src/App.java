import entities.DepartmentBoss;
import entities.Employee;
import enums.Department;

public class App {
    public static void main(String[] args) {
        Employee employee = new Employee("fulano", 24, "01/01/2001", -999, "10/01/1336");
        DepartmentBoss DepartmentBoss = new DepartmentBoss(employee, Department.CLEANING, "02/2020");
        System.out.println(employee);
        System.out.println(DepartmentBoss);
    }
}

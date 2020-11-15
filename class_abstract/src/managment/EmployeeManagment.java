package managment;

import entities.BankLoan;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import entities.DepartmentBoss;
import entities.Employee;
import enums.Department;

public class EmployeeManagment {

    public static List<Employee> employees = new ArrayList<Employee>();

    HashMap<String, enums.Department> map = new HashMap<>();

    public EmployeeManagment() {
        HashMap<String, enums.Department> map = getDepartament();
    }

    public void addEmployee() {
        Scanner input = new Scanner(System.in);
        String nameController;
        int identityController;
        double salaryController;
        String birthController;

        System.out.println("name: ");
        nameController = input.nextLine();
        System.out.println("identity: ");
        identityController = input.nextInt();
        System.out.println("salary: ");
        salaryController = input.nextDouble();
        System.out.println("birth: ");
        birthController = input.next();

        String dataNow = Calendar.getInstance().getTime().toInstant().now().toString();

        employees.add(new Employee(nameController, identityController, birthController, salaryController, dataNow));

        System.out.println("SUCCESS!");
    }

    public void addDepartmentBoss() {

        System.out.println("list employees");

        for (Employee e : employees) {
            System.out.println("--------------------------------");
            System.out.println(e.getName());
            System.out.println(e.getId());
            System.out.println("--------------------------------");
        }

        Scanner input = new Scanner(System.in);
        System.out.println("id: ");
        String id = input.next();
        boolean hasData = false;

        for (Employee e : employees) {
            if (e.getId().equals(id)) {
                hasData = true;
                System.out.println("which department: ");
                System.out.println("departments: " + "(1)" + Department.TI + "(2)" + Department.FINANCIAL + "(3)"
                        + Department.CLEANING);
                String departmentsTemp = input.next();

                Date date = Calendar.getInstance().getTime();

                String dateNow = date.toInstant().now().toString();

                employees.add(new DepartmentBoss(e, map.get(departmentsTemp), dateNow));
                employees.remove(e);
                break;
            }
        }

        if (hasData)
            System.out.println("SUCESS!");
        else
            System.out.println("ERRO!");
    }

    public void showLoanAll() {
        for (Employee e : employees) {
            System.out.println(e.toString());
            System.out.println("calculate Loan" + BankLoan.calculateLoan(e));
        }

    }

    HashMap<String, enums.Department> getDepartament() {
        HashMap<String, enums.Department> map = new HashMap<>();
        map.put("1", Department.TI);
        map.put("2", Department.FINANCIAL);
        map.put("3", Department.CLEANING);
        return map;
    }

}
